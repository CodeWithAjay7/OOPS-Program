package com.jspider.oops.main;

import com.jspider.oops.pillers.Atm;

public class AtmMain {
     
	public static void main(String[] args) {
		
		System.out.println("Main Starts");
		
		Atm atm=new Atm();
		System.out.println(atm.getbalance());

		// atm.setbalance(-1000);
		
		atm.setbalance(100000);
		atm.setbalance(5000);
		
		
	}
	


}
