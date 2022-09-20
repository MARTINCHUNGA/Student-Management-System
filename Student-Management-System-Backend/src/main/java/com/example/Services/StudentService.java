package com.example.Services;

import org.hibernate.hql.internal.ast.tree.UpdateStatement;
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

    public Student updatStudent(Student student, Long id){
        Student updatStudent = studentRepository.findById(id).orElse(null);

        if(updatStudent != null){
            updatStudent.setFirstName(student.getFirstName());
            updatStudent.setLastName(student.getLastName());
        }

        final Student myStudent = studentRepository.save(updatStudent);
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
