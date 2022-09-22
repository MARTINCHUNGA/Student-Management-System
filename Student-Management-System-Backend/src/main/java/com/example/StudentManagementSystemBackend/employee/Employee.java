package com.example.StudentManagementSystemBackend.employee;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;

@Data
@Entity
@Table(name = "Employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "firstname")
    @NotEmpty(message = "first name not entered")
    @NotNull(message = "first name can't be null")
    private String firstName;

    @Column(name = "lastname")
    @NotEmpty(message = "last name not entered")
    @NotNull(message = "last name can't be null")
    private String lastName;

    @Column(name = "sex")
    @NotEmpty(message = "sex not entered")
    private String sex;

    @Column(name = "address")
    @NotEmpty(message = "Address not filled")
    @Min(message = "address cant be number",value = 30)
    @Max(message = "address cant exceed 256", value = 256)
    private String address;

    @Column(name = "email")
    @Email(message = "Enter a valid Email")
    @NotEmpty(message = "Email can't be empty")
    private String email;

    @Column(name = "password")
    @NotEmpty(message = "Password can't be empty")
    @NotNull(message = "password cant be null")
    private String password;

    @Column(name = "rank")
    private String rank;
}
