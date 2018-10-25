package com.online.examination.subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectServices {
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	public List<Subject> getAllSubject(){
		
		List<Subject> subjects = new ArrayList();
		subjectRepository.findAll()
			.forEach(subjects::add);
		return subjects;
	}
	
	public Optional<Subject> getSubject(Integer id) {
		return subjectRepository.findById(id);
	}
	
	public void addSubject(Subject subject) {
		subjectRepository.save(subject);
	}
	
	public void updateSubject(Subject subject,Integer id) {
		subjectRepository.save(subject);
	}
	
	public void deleteSubject(Subject subject,Integer id) {
		subjectRepository.save(subject);
	}
}
