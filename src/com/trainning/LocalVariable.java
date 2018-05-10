package com.trainning;

public class LocalVariable {
	public void localvariable() {
		int age = 21;
		String name = "Pham Huy Hoang";
		System.out.println("Student's name: " + name);
		System.out.println("Student's age: " + age);
	}

	public void localvariable(String name, int age) {
		System.out.println("Student's name: " + name);
		System.out.println("Student's age: " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalVariable homeWork = new LocalVariable();
		homeWork.localvariable();
		homeWork.localvariable("Ngo Ba Thien",20);
	}

}
