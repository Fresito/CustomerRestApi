package edu.utvt.attendance.persistence.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import edu.utvt.attendance.persistence.entities.Student;

public interface StudentService {
	
	public Student save(Student student);
	
	public Student update(String id, Student student);
	
	public List<Student> getAll();
	
	public Optional<Student> findByIn(String id);
	
	public ResponseEntity<Student> deleteById(String id);

}
