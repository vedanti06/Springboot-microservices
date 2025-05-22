package com.microservice.school_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.school_service.entity.School;

@Repository
public interface SchoolRepository extends JpaRepository<School,Integer> {
}