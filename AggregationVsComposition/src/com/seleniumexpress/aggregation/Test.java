package com.seleniumexpress.aggregation;

public class Test {

	public static void main(String[] args) {
		
		Department department =new Department("Mehanical",101);
		Employee emp=new Employee("shekhar", department);
		System.exit(0);
		System.out.println(emp);

	}

}
