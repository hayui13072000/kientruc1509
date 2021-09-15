package com.example.kientruc1509.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kientruc1509.entity.Student;
import com.example.kientruc1509.service.StudentService;

@RestController
@RequestMapping("/api/student") 
public class StudentController {
	
	@Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllEmployees() {
        return studentService.findAll();
    }

    @PostMapping
    public String createEmployee(@RequestBody Student student) {
    	studentService.createStudent(student);
        return "true";
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable("id") int id) {
    	studentService.deleteById(id);
        return "true";
    }

    @PutMapping("/{id}")
    public String updateEmployee(@PathVariable("id") int id, @RequestBody Student student) {
    	student.setId(id);
    	studentService.updateById(student);
        return "true";
    }
}
