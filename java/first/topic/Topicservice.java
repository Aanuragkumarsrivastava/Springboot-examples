package first.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Topicservice 
{
	//private variable
	//using new it's become now mutable so that we can add anything to the list
	private List<Topic> topics=new ArrayList<>(Arrays.asList
			(
			new Topic("1","disney world","children book"),
			new Topic("2","harry potter","fiction book"),
			new Topic()
			));
	
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
	
	public void addtopic(Topic topic)
	{
		topics.add(topic);
	}

	public void updatetopic(String id, Topic topic) 
	{
		for(int i=0;i<topics.size();i++)
		{
			Topic t=topics.get(i);
			if(t.getId().equals(id))//if id matches
			{
				topics.set(i,topic);
				return;
			}
		}
	}

	public void deletetopic(String id)
	{
		for(int i=0;i<topics.size();i++)
		{
			Topic t=topics.get(i);
			if(t.getId().equals(id))
			{
				topics.remove(i);
				return;
			}
		}
	}

}
