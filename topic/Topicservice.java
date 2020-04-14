package first.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Topicservice 
{
	//private variable
	private List<Topic> topics=Arrays.asList
			(
			new Topic(1,"disney world","children book"),
			new Topic(2,"harry potter","fiction book"),
			new Topic()
			);
	
	//method
	public List<Topic> getlists()
	{
		return topics;
	}
	

}
