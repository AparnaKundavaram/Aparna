package com.chinni;

public class ConParameter {
	int newDoy;
	String newName;
	 
	public ConParameter(int doy, String name){
		newDoy = doy;
		newName = name;
		System.out.println("I'm a Parameter, wife of Constructor");
	}
	
	public static void main(String [] args){
		ConParameter myPar = new ConParameter(1993, "Rukmini");
		System.out.println(myPar.newDoy + " " + myPar.newName);
	}

}
