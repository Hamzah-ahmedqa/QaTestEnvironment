package com.javaCode.ControlStateMents;

public class NestedLoopsAndPatterns {

	public static void main(String[] args) {
		//the inner loop will complete one full round of iterations for every iteration of outer loop
		//outer loop is rows
		//inner loop is columns
		PatternUsingNestedLoop();	
		System.out.println("-------------------------");
		anotherExample();
		System.out.println("-------------------------");
		pattern2();
		System.out.println("-------------------------");
		pattern3();
		System.out.println("-------------------------");
		pattern4();
		System.out.println("-------------------------");
		demoForAboveToNoticeDifferent();

	}

	
	
	public static void PatternUsingNestedLoop() {
		
		for(int i = 1 ; i<=5 ; i++) {
			
	      for(int j = 1 ; j <=5 ; j++) {
	    	  System.out.print(" *");
	      }
	      System.out.println();
		}
	}
	
	public static void anotherExample() {
		 int rows = 5;
	        int cols = 5;

	        for (int i = 1; i <= rows; i++) {
	            // Print the 'i' value
	            System.out.print("I ");

	            for (int j = 1; j <= cols; j++) {
	                // Print 'J' for each column
	                System.out.print("J ");
	            }

	            // Move to the next line after completing a row
	            System.out.println();
	        }
	    }
	public static void pattern2() {
		//stairs
		
		for (int i = 1 ; i<=5 ; i++) {
			
			for(int j = 1 ; j<=i ; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}
	
	public static void pattern3() {
		
		for(int i = 1 ; i<=5 ; i++) {
			
			for(int j = 5 ; j>=i ; j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	public static void pattern4() {
	for (int i = 1 ; i<=5 ; i++) {
			
			for(int j = 1 ; j<=i ; j++) {
				System.out.print(" *");
			}
		System.out.println();
		}
	//the long line belongs to the above pattern
	for(int i = 1 ; i<=5 ; i++) {
		
		for(int j = 4 ; j>=i ; j--) { //technically this starts from 4 and is a different pattern so i can match
			System.out.print(" *");
		}
		System.out.println();
	    }
	}
	public static void demoForAboveToNoticeDifferent() {
		for(int i = 1 ; i<=5 ; i++) {
			
			for(int j = 4 ; j>=i ; j--) {
				System.out.print(" *");
			}
			System.out.println();
	}
	}
	
}
