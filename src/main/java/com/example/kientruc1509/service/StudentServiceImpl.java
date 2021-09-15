package com.example.kientruc1509.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kientruc1509.entity.Student;
import com.example.kientruc1509.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public void createStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

	@Override
	public void updateById(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
	}
	
}
