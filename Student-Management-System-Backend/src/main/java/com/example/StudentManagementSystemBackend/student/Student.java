package com.example.StudentManagementSystemBackend.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.Data;



@Data 
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private int id;

    @Column(name = "firstName")
    @NotEmpty(message = "Please enter your First Name")
    private String firstName;

    @Column(name = "lastName")
    @NotEmpty(message = "Please enter your Last Name")
    private String lastName;

    @Email(message = "Please enter valid Email Address")
    @Column(name = "email")
    @NotEmpty(message = "Please enter your Email Address")
    private String email;
    
}
