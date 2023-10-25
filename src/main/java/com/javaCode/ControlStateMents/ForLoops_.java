package com.javaCode.ControlStateMents;

public class ForLoops_ {

	public static void main(String[] args) {
	//we initialize, add the condition and addition or subtraction inside the loop.
	//the moment the condition is true it goes in the loop and does the work then it k=jumps to the iteration
	/*  Initialization
	 * 	Condition
	 *  update value
	 */
		printAProgramFrom100To1DecreasingBy10();
		System.out.println("------------------------");
		from110DecreaseUntil0By10();
		System.out.println("------------------------");
	//	printAProgramFrom100To1DecreasingBy10ANDAddTheNumbers();
	//	System.out.println("------------------------");
		from500To25InreverseANDAddTheValues();
		
	}
	
	
	public static void printAProgramFrom100To1DecreasingBy10() {
		
		for(int i = 100; i>=1 ; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void from110DecreaseUntil0By10() {
		
		//to add the numbers add sum
		int sum = 0;
		for(int i = 110 ; i>=0 ; i=i-10) {
			System.out.print(i+" ");
			sum = sum+i; //this 
	       
			//System.out.print(sum+" "); //this to show
		}
		System.out.println();
		System.out.println("this is the sum :"+sum);
	} 
	
	public static void printAProgramFrom100To1DecreasingBy10ANDAddTheNumbers() {
		
		 int sum = 0;
		for(int i = 100; i>=1 ; i--) {
			System.out.print(i+" ");
			sum = sum + i;
	//		System.out.print(" sum is |"+sum+"|"); //this is how to add the numbers
			
		}
		
	}
	
	public static void from500To25InreverseANDAddTheValues() {
		 int sum = 0;
			for(int i = 500; i>=25 ; i=i-25) {
				System.out.print(i+" ");
				sum = sum + i;
			}
			System.out.println();
			System.out.print(" sum is |"+sum+"|");
	}

}
