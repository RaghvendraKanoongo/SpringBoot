package com.example.Student.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.Student.Model.Student;
import com.example.Student.Model.StudentDao;

@Controller
public class StudentController {

	@Autowired
	StudentDao dao;
	
	@RequestMapping("/")
	public String home() {
		return"home.jsp";
	}
	@RequestMapping("/addStudent")
	public String addStudent(Student student) {
		
		System.out.println(student.name);
		System.out.println(student.roll);
		dao.save(student);
		
		return"home.jsp";
	}
	
	@RequestMapping("/getStudent")
	public ModelAndView findStudent(int roll){
		
		ModelAndView mView = new ModelAndView("showStudent.jsp");
//		Optional<Student> student;
		Student student = dao.findById(roll).orElse(null);
		System.out.println("The name of roll you searches is:"+student.name);
		mView.addObject(student);
		return mView;
	}
	@RequestMapping("/deleteStudent")
	public void deleteStudentString (int roll) {
		System.out.println("inside the delete");
		System.out.println(dao.existsById(roll));
		if(dao.existsById(roll)) {
			Student student = dao.findById(roll).orElse(null);
			dao.delete(student);
			System.out.println("Deleted Successfully");
		}
		System.out.println("Student not present");
		
	}
	 
	
}
