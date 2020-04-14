package first.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController 
{
	@Autowired
	private Topicservice topicservice;
	
		//as we need to return list of topics here so return type will be list
		//here it will maps the method 
		//executes the method
		//and takes that return object that will be converted into json format automatically because 
		//@RestController returns automatically to json format and send as http response
		@RequestMapping("/topics")
		public List<Topic> gettopics()
		{
			//so in order to return the list
			return topicservice.getlists();
		}

}
