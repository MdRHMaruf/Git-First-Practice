package com.test;

public class MainClass {

	static Person p = new Person();
	public static void main(String args[]) {
		String fullname=getFullName("Nasir","Khan PG");
		
		int getTotalAmount=getTotalAmount(10,20);
		
		String BranchInfo="";
		
		System.out.println("Branch Info"+fullname);
		
		System.out.println("Full Name "+fullname);
		
		p.setFirstName("Md RH");
		p.setSecondName("Maruf");
		
		System.out.println(p.getFirstName()+" "+p.getSecondName());
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
