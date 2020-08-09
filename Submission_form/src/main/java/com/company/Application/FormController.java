package com.company.Application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//tells the compiler that this is the controller class
public class FormController
{
	//here we also need to convert the jsp file to servelet jasper dependency required
	@RequestMapping("/form")
	public String display()
	{
		return "first.jsp";
	}
	
}
