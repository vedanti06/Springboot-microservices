package com.microservice.student_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservice.student_service.models.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
}