package com.apu;

public class Operators {
	
	public static void main (String[]args){
		int a = 5;
		int b = 3;
		int c = a * b++;
		System.out.println(b);
		
		int f = a * b++;
		System.out.println(f);
		
		int d = a * ++b;
		
		System.out.println("The value for the A: " + a + ". The value for the B: " + b + ". The value for the c: " + c + ". The value for the D: " + d);
		
			    int x = 10;
			    x += 8;
			    System.out.println(x);
		
	    // Ternary Operator.
	
	    int y = 10;
	    int z = 12;
	    String result = (y < z) ? "Sleep. " : "Die. ";
	    
	    System.out.println(result);
	    }
	    
	}
