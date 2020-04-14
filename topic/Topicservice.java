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
			new Topic("1","disney world","children book"),
			new Topic("2","harry potter","fiction book"),
			new Topic()
			);
	
	//method
	public List<Topic> getlists()
	{
		return topics;
	}
	
	public Topic gettopicsonid(String id)
	{
		//filter by id
		//compare of id of topic to id which will be passed in
		//find the first apperance and get the details displayed
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

}
