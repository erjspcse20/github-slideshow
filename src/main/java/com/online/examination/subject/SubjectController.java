package com.online.examination.subject;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="subject/api")
public class SubjectController {
	
	@Autowired
	private SubjectServices subjectServices;
	
	@RequestMapping(value="/allSubject")
	public List<Subject> getAllSubject(){
		return subjectServices.getAllSubject();
	}
	
	@RequestMapping(value="/subject/{id}")
	public Optional<Subject> getSubject(@PathVariable Integer id) {
		return subjectServices.getSubject(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addSubject")
	public void addSubject(@RequestBody Subject subject) {
		subjectServices.addSubject(subject);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/updateSubject/{id}")
	public void updateSubject(@RequestBody Subject subject, @PathVariable Integer id) {
		subjectServices.updateSubject(subject, id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/deleteSubject/{id}")
	public void deleteSubject(@RequestBody Subject subject, @PathVariable Integer id) {
		subjectServices.deleteSubject(subject, id);
	}

}
