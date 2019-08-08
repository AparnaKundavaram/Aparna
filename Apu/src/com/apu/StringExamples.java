package com.apu;

public class StringExamples {
	
	public static void main(String []args){
		
		String name = "Aparna Kundavaram";
		String fName = "Geetha";
		String lName = "Kundavaram";
		System.out.println(name.length());
		System.out.println(name.toUpperCase() + " , " + name.toLowerCase());
		System.out.println(name.indexOf("Kun"));
		System.out.println(fName.concat(lName));
		
	}

}
