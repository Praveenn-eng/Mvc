package com.ty.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ty.student.dao.StudentDao;
import com.ty.student.dto.Student;

@RestController
public class StudentController {
	@Autowired
	private StudentDao studentDao;
	
	@RequestMapping("savestudent")
	public ModelAndView saveStudent() {
		ModelAndView view = new ModelAndView();
		view.addObject("student", new Student());
		view.setViewName("create.jsp");
		return view;
	}
	
	@RequestMapping("save")
	public void saveStudent(@ModelAttribute Student student) {
		studentDao.saveStudent(student);
	}
	
	@RequestMapping("updatestudent")
	public ModelAndView updateStudent() {
		ModelAndView view = new ModelAndView();
		view.addObject("student", new Student());
		view.setViewName("update.jsp");
		return view;
	}
	
	@RequestMapping("update")
	public void updateStudent(@ModelAttribute Student student) {
		studentDao.updateStudent(student);
	}
	
	@RequestMapping("deletestudent")
	public ModelAndView deleteStudent() {
		ModelAndView view = new ModelAndView();
		view.addObject("student", new Student());
		view.setViewName("delete.jsp");
		return view;
	}
	
	@RequestMapping("delete")
	public void deleteStudent(@ModelAttribute Student student) {
		studentDao.deleteStudent(student.getId());
	}
	
	@RequestMapping("getstudent")
	public ModelAndView getStudent() {
		ModelAndView view = new ModelAndView();
		view.addObject("student", new Student());
		view.setViewName("get.jsp");
		return view;
	}
	
	@RequestMapping("get")
	public ModelAndView getStudent(@ModelAttribute Student student) {
		ModelAndView view = new ModelAndView();
		Student student2 = studentDao.getStudentById(student.getId());
		view.addObject("student", student2);
		view.setViewName("view.jsp");
		return view;
	}
	
	@RequestMapping("getallstudent")
	public ModelAndView getAllStudent() {
		ModelAndView view = new ModelAndView();
		view.addObject("students", new Student());
		view.setViewName("getAll.jsp");
		return view;
	}
	
	@RequestMapping("getall")
	public ModelAndView getAllStudents() {
		ModelAndView view = new ModelAndView();
		List<Student> students = studentDao.getAllStudents();
		view.addObject("students", students);
		view.setViewName("viewall.jsp");
		return view;
	}
}
