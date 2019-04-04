package com.apu;

public class Exceptions {
	
	public static void main(String [] args){
		
		try {
			String[] ssmb = {"Athadu", "Pokiri", "BAN", "Okkadu", "Murari"};
			System.out.println(ssmb[4]);
			System.out.println(ssmb.length);
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Shutup and check your index value");
		} finally {
			System.out.println("Done trying and catching the shit");
		} 
	}

}
