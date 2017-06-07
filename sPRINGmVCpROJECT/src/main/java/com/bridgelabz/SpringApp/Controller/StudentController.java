package com.bridgelabz.SpringApp.Controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.SpringApp.Model.Student;

@Controller
@RequestMapping("/")
public class StudentController {

	@RequestMapping(value = "registration", method = RequestMethod.POST)
	public ModelAndView registration() {
		return new ModelAndView("Registration");
	}
/*
	@RequestMapping(value = "registrationUser", method = RequestMethod.POST)
	public void registrationUser(Student student) {
		System.out.println(student.toString());

	}*/
	
	

}