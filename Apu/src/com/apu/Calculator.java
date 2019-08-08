package com.apu;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String []args){
		Scanner inputUser = new Scanner(System.in);
		System.out.println("Enter the value, of A");
		int A = inputUser.nextInt();
		System.out.println("Enter the value, of B");
		int B = inputUser.nextInt();
		double sum = A+B;
		// Printing sum of A and B
		System.out.println("Sum of " + A + " and " + B + " is " + sum);
		// Subtraction of A and B with conditional format.
		if(A>B){
			double sub = A-B;
			System.out.println("Difference of " + A + " and " + B + " is " + sub);
		}else{
			double sub = B-A;
			System.out.println("Difference of " + A + " and " + B + " is " + sub);
		}
		// Multiplication of A and B.
		double mul = A*B;
		System.out.println("Multiplication of " + A + " and " + B + " is " + mul);
		// Division of A and B with conditional format.
		if(B==0){
			System.out.println("Infinity");
		}else{
			double div = A/B;
			System.out.println("Division of " + A + " and " + B + " is " + div);
		}
		inputUser.close();
		//System.out.println(sum);
	}

}
