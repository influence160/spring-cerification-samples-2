package com.othmen.testspring.springcore.loadcontext.beans;

public class TestBean2 {
	
	TestBean tb;

	public TestBean2(TestBean tb) {
		System.out.println("new TestBean2");
		this.tb = tb;
	}
}
