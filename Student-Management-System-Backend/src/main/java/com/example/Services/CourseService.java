package com.example.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentManagementSystemBackend.Models.Course;
import com.example.StudentManagementSystemBackend.Repositories.CourseRepository;

//provide business logic in this class
@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;


    public Course findCourseByName(String courseName){
        return courseRepository.findByCourseName(courseName);
    }

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public Course saveCourse(Course course){
        return courseRepository.save(course);
    }

    public Course updateCourse(Course course, Long id){
        Course updateCourse = courseRepository.findById(id).orElse(null);

        if(updateCourse != null){
            updateCourse.setCourseName(course.getCourseName());
            updateCourse.setCourseDuration(course.getCourseDuration());
        }

        final Course myCourse = courseRepository.save(updateCourse);
        return myCourse;
    }

    public Boolean deleteCourse(Long id){

        Course delCourse = courseRepository.findById(id).orElse(null);
        if(delCourse != null){
            courseRepository.delete(delCourse);
            return true;
        } 

        return false;
    }
    
}
