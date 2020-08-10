package com.company.Application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller//tells the compiler that this is the controller class
public class FormController
{
	//here we also need to convert the jsp file to servelet jasper dependency required
	@GetMapping("/form")
	public String display()
	{
		return "first";
	}
	
	@PostMapping("/details")
	public String details(@RequestParam("id") String id,@RequestParam("name") String name,@RequestParam("email") String email,ModelMap modelmap)
	{
		modelmap.put("id", id);
		modelmap.put("name",name);
		modelmap.put("email",email);
		return "Viewdetails";
	}
}
