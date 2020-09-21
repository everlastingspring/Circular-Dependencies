package com.pluralsight.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Employee implements ApplicationContextAware,InitializingBean{

	//@Autowired
	Employer employer;
	String firstName = "Lucifer";
	String lastName = "Morningstar";
	ApplicationContext context;

//	@Autowired
//	public Employee(Employer employer) {
//		this.employer = employer;
//	}
	
	public String getEmployeeName() {
		return firstName+" "+lastName;
	}
	
	public Employer getEmployer() {
		return employer;
	}
	//@Autowired
	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	@Override
	public String toString() {
		return "Employee [employer=" + employer + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		employer=context.getBean(Employer.class);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context=applicationContext;
		
	}

}
