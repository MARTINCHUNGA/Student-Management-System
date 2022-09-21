package com.example.StudentManagementSystemBackend.employe;

import javax.persistence.*;
import javax.validation.constraints.*;

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


    public Employee() {
    }

    public Employee(int id,
                    String firstName,
                    String lastName,
                    String sex,
                    String address,
                    String email,
                    String password,
                    String rank) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.address = address;
        this.email = email;
        this.password = password;
        this.rank = rank;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRank() {
        return rank;
    }
}
