package com.example.StudentManagementSystemBackend.course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.*;
import javax.persistence.*;

@Data
@Entity
@Table(name = "courses")
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private int courseId;

    @Column(name = "courseName")
    @NotEmpty(message = "Please enter course name")
    private String courseName;

    @Column(name = "creditHours")
    @NotEmpty(message = "Please enter credit hours")
    private String creditHours;

    @Column(name = "courseCode")
    @NotEmpty(message = "Enter courseCode")
    private String courseCode;

    @Column(name = "courseDuration")
    @NotEmpty(message = "Please enter course duration")
    private String courseDuration;

    //default constructor
    public  Course(){

    }

    //parameterized constructor
    public Course(int courseId, String courseName, String creditHours, String courseCode, String courseDuration) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.courseCode = courseCode;
        this.courseDuration = courseDuration;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(String creditHours) {
        this.creditHours = creditHours;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }
}
