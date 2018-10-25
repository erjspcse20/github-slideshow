package com.online.examination.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="topic/api")
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping(value="/allUnit")
	public List<Topic> getAllUnit(){
		return topicService.getAllTopic();
	}
	
	@RequestMapping(value="/unit/{id}")
	public Optional<Topic> getUnit(@PathVariable Integer id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addUnit")
	public void addUnit(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/updateUnit/{id}")
	public void updateUnit(@RequestBody Topic topic, @PathVariable Integer id) {
		topicService.updateTopic(topic, id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/deleteUnit/{id}")
	public void deleteUnit(@RequestBody Topic topic, @PathVariable Integer id) {
		topicService.deleteTopic(topic, id);
	}
}
