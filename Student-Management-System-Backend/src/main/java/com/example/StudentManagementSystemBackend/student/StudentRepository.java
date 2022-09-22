package com.example.StudentManagementSystemBackend.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("StudentRepository") //extend JpaRepo because we need customized querry
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByEmail(String email); //declaring querry method
    
}
