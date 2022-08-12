package com.mike.learnjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mike.learnjpa.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long>{
    
    
}
