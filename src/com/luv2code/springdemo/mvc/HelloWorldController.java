package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworldform";
	}
	
	@RequestMapping("/processForm")
	public String processForm(){
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersion2")
	public String letsShoutDude(HttpServletRequest req,Model model){
		
		String theName=req.getParameter("studentname");
		
		theName=theName.toUpperCase();
		
		String result="Hey my friend! "+theName;
		
		model.addAttribute("message",result);
		
		return "helloworld";
		
	}
	
	@RequestMapping("/processFormVersion3")
	public String processFormVersion3(@RequestParam("studentname") String theName,Model model){
		
		
		theName=theName.toUpperCase();
		
		String result="YO! YO! "+theName;
		
		model.addAttribute("message",result);
		
		return "helloworld";
		
	}	
	

}
