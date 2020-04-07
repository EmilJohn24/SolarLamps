package com.test;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class Test {
	@XmlElement
	private String testName;
	
	@XmlElement
	private int testNumber;
	
	public Test(String testName, int testNumber) {
		this.testName = testName;
		this.testNumber = testNumber;
	}
	
	public Test() {
		
	}
	
	public void setName(String name) {
		this.testName = name;
	}
	
	public void setNumber(int number) {
		this.testNumber = number;
	}
	
	public String getTestName() {
		return testName;
	}
	
	public int getTestNumber() {
		return testNumber;
	}
	
	
}
