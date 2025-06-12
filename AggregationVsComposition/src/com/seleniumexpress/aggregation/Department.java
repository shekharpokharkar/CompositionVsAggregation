package com.seleniumexpress.aggregation;

public class Department {

	private String departmentName;
	private Integer departmentId;

	public Department(String departmentName, Integer departmentId) {
		super();
		this.departmentName = departmentName;
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", departmentId=" + departmentId + "]";
	}

}
