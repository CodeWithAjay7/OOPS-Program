package com.jspider.oops.pillers;

interface Bank {
   
	int balance=10000;//public static final
	
	void withdraw(); //public abstract
	void deposit();  //public abstract
	
	default void display1() {
		System.out.println("Remember the name");
	}
	static void display2() {
		System.out.println("It's Ajjubhai");
	}
}
