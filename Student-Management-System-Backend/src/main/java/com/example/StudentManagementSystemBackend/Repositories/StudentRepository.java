package com.example.StudentManagementSystemBackend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentManagementSystemBackend.Models.Student;

@Repository("StudentRepository") //extend JpaRepo because we need customized querry
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByEmail(String email); //declaring querry method
    
}
