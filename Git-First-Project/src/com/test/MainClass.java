package com.test;

public class MainClass {

	static Person p = new Person();
	public static void main(String args[]) {
		String fullname=getFullName("Nasir","Khan","PG");
		
		int getTotalAmount=getTotal(10,20);
		
		String BranchInfo="Nasir Branch";
		
		System.out.println("Branch Info"+fullname);
		
		System.out.println("Full Name "+fullname);
		
		String name=name();
		System.out.println("Name "+name);
		
		p.setFirstName("Md RH");
		p.setSecondName("Maruf");
		
		System.out.println(p.getFirstName()+" "+p.getSecondName());
		
		String secondconfig="Second Configue";
		System.out.println("secondconfig "+secondconfig);
	}

	private static int getTotal(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	private static String name() {
		return "Nasir Uddin";
		
	}
	private static String getFullName(String string, String string2,String title) {
		// TODO Auto-generated method stub
		return string+" "+string2+" "+title;
	}
	
	
	
	
}
