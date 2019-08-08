package com.apu;

import java.util.Scanner;

public class CalculatorSwitch {
	
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int result = 0;
		
		System.out.print("Enter an expression to compute: ");
        String userInput = input.nextLine();

        // The tokens that make up the input
        String[] tokens = userInput.split(" ");
		// addition of 1 and 2
		switch(tokens[0]) {
		case "addition":
		case "sum":
		//case "+":
			result = Integer.parseInt(tokens[2])
            + Integer.parseInt(tokens[4]);
			break;
		case "+":
			result = Integer.parseInt(tokens[0])
            + Integer.parseInt(tokens[2]);
			break;
			
		case "subtraction":			
		case "difference":
		//case "-":
			result = Integer.parseInt(tokens[2])
            - Integer.parseInt(tokens[4]);
			break;
			
		case "multiplication":		
		//case "*":
			result = Integer.parseInt(tokens[2])
            * Integer.parseInt(tokens[4]);
			break;
			
		case "division":
		//case "/":
			result = Integer.parseInt(tokens[2])
            / Integer.parseInt(tokens[4]);
			break;	
		}input.close();
		System.out.println(userInput + " = " + result);
		//System.out.println(sum);
	}

}
