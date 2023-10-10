package com.jspider.oops.pillers;

public class BankImplement implements Bank {

	@Override
	public void withdraw() {
		System.out.println("Money Withdraw Successfully");
		
	}

	@Override
	public void deposit() {
		System.out.println("Money deposit Successfully");
		
	}
	@Override
	public void display1() {
		System.out.println("Remember the name once again");
	}
	public  void display2() {
		System.out.println("It's Ajjubhai");
	}

}
