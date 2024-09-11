package com.test;


public class Employee {
	public void Employee() {
		System.out.println("Default Const...");
	}
	protected void finalize() throws Throwable {
		System.out.println("Object Destroyed...");
	}
	public static void main(String[] args)  {
		Employee sample = new Employee();
		sample=null;
		System.gc();
	}
}

