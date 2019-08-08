package com.apu;

public class Loops {
	
	public static void main(String []args){
		// While loop concept.
		int i = 0;
		do {
			System.out.println(i);
			i++;
		}
		while (i < 5);
		
		// For loop concept.
		for(int j = 0; j < 5; j++){
			System.out.println(j);
		}
		// For each concept.
		String[] shoes = {"Adidas", "Nike", "Jordan", "Puma", "Timberland"};
		for (String k : shoes){
			// Java Break concept.
			//if (k == "Jordan"){
			  if (k == "Puma"){
				continue;
				
			} System.out.println(k);		
		}
		// Array.
		String[] family = {"Geetha", "Narsimha Reddy", "Umesh", "Pavan", "Aparna"};
		System.out.println(family[0]);
		System.out.println(family.length);
		
	}

}
