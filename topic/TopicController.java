package first.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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

		//in order to get list based on id like /topics/id in url
		//{id} tells it's a variable part we can change any time
		//how to tell spring that {id} is that id at method level public Topic gettopiconid(String id)
		//in order to tell we use @PathVariable annotation at method level before that id variable
		@RequestMapping("/topics/{id}")
		public Topic gettopiconid(@PathVariable String id)
		{
			//call method on business service and pull that topic
			return topicservice.gettopicsonid(id);
			
			
		}
}
