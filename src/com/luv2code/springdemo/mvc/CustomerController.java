package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model){
		
		model.addAttribute("customer", new Customer());
		return "customer-form";
		
	}
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		StringTrimmerEditor stringtrimmereditor=new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringtrimmereditor);
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer cust,BindingResult theBindingResult){
		System.out.println(theBindingResult);
		if(theBindingResult.hasErrors())
			return "customer-form";
		else
			return "customer-confirmation";
	}

}
