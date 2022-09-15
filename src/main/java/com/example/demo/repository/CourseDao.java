package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.data.Courses;

// T-- data  , ID- type of primary key in data
public interface CourseDao extends JpaRepository<Courses, Long> {

}
