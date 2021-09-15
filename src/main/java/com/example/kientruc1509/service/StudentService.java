package com.example.kientruc1509.service;

import java.util.List;

import com.example.kientruc1509.entity.Student;

public interface StudentService {
	List<Student> findAll();

    void createStudent(Student student);

    void deleteById(int id);

    void updateById(Student student);
}
