package com.example.StudentManagementSystemBackend.student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentManagementSystemBackend.Models.Student;

@RestController
@RequestMapping("/api/vi")
public class StudentController {

    @Autowired
    private StudentService studentService;

    //http get request
    @GetMapping("/students")
    public List<Student> all(){
        return studentService.getAllStudents();
    }

    //http post request
    @PostMapping("/students")
    public ResponseEntity<Student> createStudent(@Valid @RequestBody Student student){
        return ResponseEntity.ok(studentService.saveStudent(student));
    }

    //http put request
    @PutMapping("/students/{id}")
    public ResponseEntity<Student> updateStudent(@Valid @RequestBody Student student , 
    @PathVariable(value = "id") Long id){
        return ResponseEntity.ok(studentService.updateStudent(student, id));
        
    }

    //http delete request
    @DeleteMapping("/students/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable Long id){
        Map<String, String> response = new HashMap<String, String>();
        if(studentService.deleteStudent(id)){
            response.put("status", "success");
            response.put("message", "Student deleted successfully");
            return ResponseEntity.ok(response);
        } else {
            response.put("status", "error");
            response.put("message", "Something went wrong when deleting Student");
            return ResponseEntity.status(500).body(response);
        }
    }
    
}
