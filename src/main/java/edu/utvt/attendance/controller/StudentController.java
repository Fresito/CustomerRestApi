package edu.utvt.attendance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.utvt.attendance.persistence.entities.Student;
import edu.utvt.attendance.persistence.service.StudentService;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping
	public List<Student> get() {
		return this.studentService.getAll();
	}

}
