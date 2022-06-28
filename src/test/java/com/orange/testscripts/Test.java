package com.orange.testscripts;

public class Test {

	public void m1() {
		System.out.println("I am non static m1");
	}
	
	public static void m2() {
		System.out.println("I am non static m2");
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		t.m1();
		m2();
	}
}
