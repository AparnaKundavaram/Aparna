package com.apu;

public class ThrowException {
	// Creating a function.
	static void haanikaram(int age) {
		try{
			if(age<18){
				throw new ArithmeticException("Madhyam sevinchadam haanikaram, vinakapothe saav");
			} else {
				System.out.println("Unnadhi okate zindhagi, thagey, sachipo");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Mummy ni adgu complan ivvamani");
		}
				
	}
	public static void main(String [] args){
		
		// Calling a Function 
		haanikaram(15);
		
	}

}
