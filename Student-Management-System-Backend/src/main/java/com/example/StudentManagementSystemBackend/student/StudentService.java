package com.example.StudentManagementSystemBackend.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.StudentManagementSystemBackend.Models.*;

import com.example.StudentManagementSystemBackend.Repositories.StudentRepository;

import java.util.List;


//write business logic in service class
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student findStudentByEmail(String email){
        return studentRepository.findByEmail(email);
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public Student updateStudent(Student student, Long id){
        Student updateStudent = studentRepository.findById(id).orElse(null);

        if(updateStudent != null){
            updateStudent.setFirstName(student.getFirstName());
            updateStudent.setLastName(student.getLastName());
        }

        final Student myStudent = studentRepository.save(updateStudent);
        return myStudent;
    }

    public Boolean deleteStudent(Long id){

        Student delStudent = studentRepository.findById(id).orElse(null);
        if(delStudent != null){
            studentRepository.delete(delStudent);
            return true;
        } 

        return false;
    }

    
}
