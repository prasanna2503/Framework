package com.test;

public class Employee {
	static Employee emp;
	private Employee() {
		System.out.println("Default Const....");
	}
	public static Employee getObject() {
		if(emp==null) {
			emp= new Employee();
		}
		return emp;
	}
	public void getEmpName() {
		System.out.println("Name is Prasanna");

	}
	public void getAddress() {
		System.out.println("Chennai");

	}
}

