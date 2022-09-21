package com.example.StudentManagementSystemBackend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentManagementSystemBackend.Models.Course;

@Repository("CourseRepository")
public interface CourseRepository extends JpaRepository<Course, Long> {
    Course findByCourseName(String courseName);
    
}
