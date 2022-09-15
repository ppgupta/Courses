package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.data.Courses;


public interface CourseService {

	public List<Courses> getCourse( );

	public Courses getCourse(Long courseId) ;
	public List<Courses> addCourses(List<Courses> c);

	public Courses updateCourse(Courses c);

	public void deleteCourse(Long courseId);
	 
}
