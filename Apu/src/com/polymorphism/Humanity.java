package com.polymorphism;

public class Humanity {
	public static void main(String [] args){
		PolyHuman human = new PolyHuman();
		PolyHuman sel = new Selfish();
		PolyHuman df = new DoubleFaced();
		
		human.Hurt();
		sel.Hurt();
		df.Hurt();
		
	}

}
