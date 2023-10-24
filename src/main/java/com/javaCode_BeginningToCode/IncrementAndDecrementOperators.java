package com.javaCode_BeginningToCode;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
	
		//++ is increment
		// -- decrement 
		
		int i = 10;
		i++; //this is now 11, post increment 
		++i; //now 12, pre increment 
		i--; //now 11 post decrement 
		--i; // now 10 pre decrement 
		System.out.println(i);
		
		int j = 1; //j is 1
		System.out.println("this is j with no increments: "+j);
		j++; 
		System.out.println("this is j after 1 increment: "+j);
		++j;
		System.out.println("this is j after 2nd increment: "+j);
		
		

	}

}
