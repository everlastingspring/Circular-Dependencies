package com.pluralsight.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employer {

	//@Autowired
	Employee employee;
	String firstName = "jon";
	String lastName = "decker";

	@Autowired
	public Employer(Employee employee) {
		this.employee = employee;
	}
	
	//@Autowired
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public String getEmployerName() {
		return firstName+" "+lastName;
	}
	
	public Employee getEmployee() {
		return employee;
	}

	@Override
	public String toString() {
		return "Employer [employee=" + employee + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
