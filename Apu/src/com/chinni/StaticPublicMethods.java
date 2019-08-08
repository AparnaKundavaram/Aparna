package com.chinni;

public class StaticPublicMethods {
	
	static void staticMethod(){
		System.out.println("I'm Static Method and am Sexy");
	}
	
	public void publicMethod(){
		System.out.println("I'm Public Method and am Pretty");
	}
	
	public static void main(String [] args){
		staticMethod();
		StaticPublicMethods object = new StaticPublicMethods();
		object.publicMethod();
	}
}
