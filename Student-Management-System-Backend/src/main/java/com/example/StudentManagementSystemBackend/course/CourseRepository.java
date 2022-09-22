package com.example.StudentManagementSystemBackend.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("CourseRepository")
public interface CourseRepository extends JpaRepository<Course, Long> {
    Course findByCourseName(String courseName);
    
}
