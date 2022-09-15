package com.example.demo.service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.example.demo.data.Courses;
import com.example.demo.repository.CourseDao;
@Service
public class CourseServiceImpl implements CourseService {

//	List<Courses> list;
	@Autowired
	private CourseDao courseDao;
	
//	

	@Override
	public List<Courses> getCourse() {
		return courseDao.findAll();
	}

	
	@Override
	public Courses getCourse(Long courseId)  {
//		Courses c=null;
//		for(Courses course:list) {
//			if(course.getCourseId()==courseId) {
//				c=course;
//				break;
//			}
//		}
//		return  courseDao.getOne(courseId);
        return courseDao.findById(courseId).get();
	}

	@Override
	public List<Courses> addCourses(List<Courses> c) {
		//list.add(c);
		return  courseDao.saveAll( c);
	}

	@Override
	public Courses updateCourse(Courses course) {
		//Courses c=null;
		/*for(Courses course1:list) {
			if(course1.getCourseId()==course.getCourseId()) {
				course1.setCourseName(course.getCourseName());
				course1.setDescription(course.getDescription());
				//c=course1;
				//break;
			}*/
//		list.forEach(e->{
//			if(e.getCourseId()==course.getCourseId()) {
//				e.setCourseName(course.getCourseName());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(Long courseId) {
		// TODO Auto-generated method stub
//		list=this.list.stream().filter(e->e.getCourseId()!=courseId).collect(Collectors.toList());
		Courses entity=courseDao.findById(courseId).get();
		courseDao.delete(entity);
	}
	
	
	

}
