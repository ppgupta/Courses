package com.example.demo.data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;


@javax.persistence.Entity
@Table(name="users")
public class Courses {
 private String courseName;
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long courseId;
 private String description;
 
 public Courses() {}
public Courses(String courseName, Long courseId, String description) {
	super();
	this.courseName = courseName;
	this.courseId = courseId;
	this.description = description;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public Long getCourseId() {
	return courseId;
}
public void setCourseId(Long courseId) {
	this.courseId = courseId;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
 
	
}
