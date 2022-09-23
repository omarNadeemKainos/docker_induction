package com.example.api.perf.test.service;

import com.example.api.perf.test.model.Student;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
}
