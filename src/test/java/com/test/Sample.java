package com.test;

public class Sample {
	public static void main(String[] args) {
		Employee e1 = Employee.getObject();
		e1.getEmpName();
		e1.getAddress();
		System.out.println(System.identityHashCode(e1));
		Employee e2 = Employee.getObject();
		e2.getEmpName();
		e2.getAddress();
		System.out.println(System.identityHashCode(e2));
	}
}