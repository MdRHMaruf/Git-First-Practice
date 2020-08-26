package com.test;

public class MainClass {
	static Person p = new Person();
	
	public static void main(String args[]) {
		p.setFirstName("Md RH");
		p.setSecondName("Maruf");
		
		System.out.println(p.getFirstName()+" "+p.getSecondName());
	}
}
