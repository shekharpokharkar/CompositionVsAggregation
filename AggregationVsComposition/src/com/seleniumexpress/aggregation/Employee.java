package com.seleniumexpress.aggregation;

public class Employee {
	
	private String employeeName;
	private Department department;
	
	public Employee(String employeeName, Department department) {
		
		this.employeeName = employeeName;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", department=" + department + "]";
	}
	
	

}
