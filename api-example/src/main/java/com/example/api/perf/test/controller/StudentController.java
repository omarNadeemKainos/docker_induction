package com.example.api.perf.test.controller;

import com.example.api.perf.test.model.Student;
import com.example.api.perf.test.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/new-student", consumes = "application/json")
    public ResponseEntity<Student> createNewStudent(@RequestBody Student student) {
        Student newStudent = studentService.createStudent(student.getName(), student.getDescription());

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
        return ResponseEntity.created(location).body(newStudent);
    }

    @PostMapping("/students")
    public ResponseEntity<Void> createStudents() {
        studentService.createStudents();

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping("/all-students")
    public List<Student> retrieveStudents() {
        return studentService.retrieveStudents();
    }

    @GetMapping("/students/{studentId}")
    public Student retrieveStudent(@PathVariable Integer studentId) {
        return studentService.retrieveStudent(studentId);
    }
}
