package com.teacher;

import com.chinni.encap.Idiot;

public class Teacher {
	public static void main(String [] args){
		Idiot deepak = new Idiot();
		Student chandu = new Student();
		System.out.println(chandu.fName + " " + chandu.lName + " " + "Student Id: " + chandu.Id);
		System.out.println(deepak.getName());
	}
	
}
