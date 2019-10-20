package com.luv2code.springdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String> {
	
	
	public String[] coursePrefix;
	public void initialize(CourseCode theCourseCode){
		
		coursePrefix=theCourseCode.value();
		
	}
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result = false;
		if(theCode!=null){
			for(String temp:coursePrefix){
				result=theCode.startsWith(temp);
				if(result){
					break;
				}
			}
		}
			
		else{
			result=true;
		}
		return result;
	}



}
