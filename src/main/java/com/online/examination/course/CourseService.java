package com.online.examination.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourse(){
		List<Course> courses = new ArrayList();
		courseRepository.findAll()
			.forEach(courses::add);
		return courses;
	}
	
	public Optional<Course> getCourses(Integer id) {
		return courseRepository.findById(id);
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	
	public void updateCourse(Course course, Integer id) {
		courseRepository.save(course);
	}
	
	public void deleteCourse(Course course, Integer id) {
		courseRepository.save(course);
	}

}
