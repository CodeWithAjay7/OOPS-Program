package com.jspider.oops.pillers;

public class Atm {
    
	private int balance;
 
	public int getbalance() {
		return balance;
	}

	public void setbalance(int balance) {
		
		if(balance<0) {
			System.out.println("Balance can not be negative");
		}
		else {
			this.balance=balance;
			
			System.out.println("Balance set successfully");
		
		}
		
	}
     
     
}
