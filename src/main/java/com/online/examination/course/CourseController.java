package com.online.examination.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="course/api")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value="/allCourse")
	public List<Course> getAllCourse(){
		return courseService.getAllCourse();
	}
	
	@RequestMapping(value="/course/{id}")
	public Optional<Course> getCourse(@PathVariable Integer id) {
		return courseService.getCourses(id);
	}
	
	@RequestMapping(value="/addCourse")
	public void addCourse(@RequestBody Course course) {
		courseService.addCourse(course);
	}
	
	@RequestMapping(value="/updateCourse/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable Integer id) {
		courseService.updateCourse(course, id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/deleteCourse/{id}")
	public void deleteCourse(@RequestBody Course course, @PathVariable Integer id) {
		courseService.deleteCourse(course, id);
		
	}

}
