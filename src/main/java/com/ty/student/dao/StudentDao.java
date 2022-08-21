package com.ty.student.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.student.dto.Student;

@Repository
public class StudentDao {
	@Autowired
	private EntityManager entityManager;
	
	@Autowired
	private EntityTransaction entityTransaction;
	
	public void saveStudent(Student student) {
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}
	
	public void updateStudent(Student student) {
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
	}
	
	public void deleteStudent(int id) {
		Student student = entityManager.find(Student.class, id);
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();
	}
	
	public Student getStudentById(int id) {
		return entityManager.find(Student.class, id);
	}
	
	public List<Student> getAllStudents(){
		return entityManager.createQuery("SELECT s FROM Student s").getResultList();
	}
}
