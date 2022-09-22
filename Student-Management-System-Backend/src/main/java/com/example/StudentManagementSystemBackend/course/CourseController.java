package com.example.StudentManagementSystemBackend.course;

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


@RestController
@RequestMapping("/api/vi")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> all(){
        return courseService.getAllCourses();
    }

    @PostMapping("/courses")
    public ResponseEntity<Course> createCourse(@Valid @RequestBody Course course){
        return ResponseEntity.ok(courseService.saveCourse(course));
    }

     //http put request
     @PutMapping("/courses/{id}")
     public ResponseEntity<Course> updateCourse(@Valid @RequestBody Course course ,
     @PathVariable(value = "id") Long id){
         return ResponseEntity.ok(courseService.updateCourse(course, id));
         
     }
 
     //http delete request
     @DeleteMapping("/courses/{id}")
     public ResponseEntity<?> deleteCourse(@PathVariable Long id){
         Map<String, String> response = new HashMap<String, String>();
         if(courseService.deleteCourse(id)){
             response.put("status", "success");
             response.put("message", "Course deleted successfully");
             return ResponseEntity.ok(response);
         } else {
             response.put("status", "error");
             response.put("message", "Something went wrong when deleting Course");
             return ResponseEntity.status(500).body(response);
         }
     }
    
}
