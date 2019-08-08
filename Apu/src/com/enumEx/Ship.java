package com.enumEx;

public class Ship {
	
	enum Shipping {
		standard,
		express,
		secondDay
	}
	public static void main(String [] args){
		//Shipping type = Shipping.express;
		Shipping type1 = Shipping.standard;
		//Shipping type2 = Shipping.secondDay;
		
		switch(type1) {
		case standard:
		
			System.out.println("Standard shipping takes 5 to 12 days");
			break;
		case express:
			
			System.out.println("Express shipping takes 3 to 5 days");
			break;
		case secondDay:
			
			System.out.println("Second Day shipping takes 1 to 2 days");
		}
			
	}

}
