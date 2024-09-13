package com.test;

public class Demo {
	public Demo() {
		System.out.println("Default con...");
	}
	protected void finalize() {
		System.out.println("Object destroyed...");
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		d=null;
		System.gc();
	}
}
