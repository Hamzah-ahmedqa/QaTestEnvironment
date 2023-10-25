package com.javaCode.ControlStateMents;

public class IfElseSelectionalOrConditionStatements {

	public static void main(String[] args) {
		// 1) selection or conditional statements
		//if, if else , if else if , nested if , switch
		
		//if the condition is wrong no purpose to go into the body
		if(2<3) {
			System.out.println("true, first condition");
			//some other logic
		}
		
	
		//if else
		if(2>5) {
			System.out.println("Code for our logic to be true");
		}
		else {
			System.out.println("The condition is wrong");
		}//this else does not need a curly bracket but you can put one
		
		//find the largest of 3 numbers
		
		int i = 10;
		int j = 20;
		int k =30;
		
		if (i>j && i>k) {
			System.out.println("I is the greatest :"+i);
		}
		else if (j>i && j>k) {
			System.out.println("J is the greatest :"+j);
			
		}
		else {
			System.out.println("K is the greatest :"+k);
		}
		
		//WAP TO DETERMINE WHICH NUMBER IS PRIME it can only be dived by 1 and itself
		int x = 10, y = 30, h = 45, z = 1 , d = 21;
		
		
		//wap to determine which are even or odd
		
		int a = 10, b = 2 , c = 15;
		if(a%2 == 0) {
			System.out.println("a is an even number");
		}
		else{
			System.out.println("a is an odd number");
		}
		// do this with the rest of the numbers as well
		
	}

	
	

}
