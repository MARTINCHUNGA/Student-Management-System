package com.example.StudentManagementSystemBackend.Models;

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

    @Column(name = "courseDuration")
    @NotEmpty(message = "Please enter course duration")
    private String courseDuration;


    
}
