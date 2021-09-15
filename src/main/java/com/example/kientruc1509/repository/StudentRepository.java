package com.example.kientruc1509.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.kientruc1509.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
