package com.test;

public class MainClass {
	public static void main(String args[]) {
		String fullname=getFullName("Nasir","Khan PG");
		
		int getTotalAmount=getTotalAmount(10,20);
		
		System.out.println("Full Name "+fullname);
	}

	private static int getTotalAmount(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	private static String getFullName(String string, String string2) {
		// TODO Auto-generated method stub
		return string+" "+string2;
	}
	
	
}
