package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Courses;
import com.example.demo.service.CourseService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class MyController {
    
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/courses")
	public List<Courses> getCourses() {
		//System.out.println("hey there");
		return this.courseService.getCourse();
	}
	@GetMapping("/courses/{courseId}")
	public Courses getCourses(@PathVariable Long courseId) {
		//System.out.println("hey there");
		return this.courseService.getCourse(courseId);
	}
	
	@PostMapping("/courses")
	public List<Courses> addCourses(@RequestBody List<Courses> c) {
		
		return this.courseService.addCourses(c);	
	}
	
	@PutMapping("/courses")
	public Courses updateCourses(@RequestBody Courses c) {
		//System.out.println("hey there");
		return this.courseService.updateCourse(c);
	}
	
	
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourses(@PathVariable Long courseId) {
		try {
			 this.courseService.deleteCourse(courseId);
			 return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);	
			}
	}
	
}
