package com.example.api.perf.test.service;

import com.example.api.perf.test.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student createStudent(String studentName, String studentClass) {
         Student student = new Student(studentName, studentClass);
         student = repository.save(student);

        return student;
    }

    public void createStudents() {
        List<Student> students = new ArrayList<>();
        List<Student> savedStudents = new ArrayList<>();

        students.add(new Student("Paddy Fox", "Class 9-5"));
        students.add(new Student("Sarah Jessica Parker", "Class 96"));
        students.add(new Student("James Bond", "Class 007"));

        Iterable<Student> itrStudents=repository.saveAll(students);
        itrStudents.forEach(savedStudents::add);
    }

    public Student retrieveStudent(Integer studentId) {

       return repository.findById(studentId).orElse(new Student());
    }

    public List<Student> retrieveStudents() {

        return (List<Student>) repository.findAll();
    }
}
