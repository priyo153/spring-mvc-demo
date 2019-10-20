package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel){
		
		
		Student theStudent=new Student();
		theModel.addAttribute("mystudent",theStudent);
		
		return "studentForm2";
	}
	
	@RequestMapping("processForm")
	public String processForm(@ModelAttribute("mystudent") Student theStudent){
		
		
		System.out.println("in processform");
		return "studentConfirmation";
		
	}

}
