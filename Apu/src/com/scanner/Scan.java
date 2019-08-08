package com.scanner;
import java.util.Scanner;

public class Scan {
	public static void main(String [] args){
		Scanner userInput = new Scanner(System.in);
		System.out.println(userInput.nextInt());
		
		userInput.close();
	}

}
