package com.javaCode.ControlStateMents;

public class WhileLoop {

	public static void main(String[] args) {
		/*
		 * while loop is a control flow statement that is used when the boolean condition needs a lot of repitition 
		 * sometimes know as repeating if statement 
		 * if the iteration is not fixed its recommended to use while
		 * 
		 * 
		 */
		
		//Initialization
		//condition
		//increment or decrement 
		printFirst10Numbers();
		System.out.println();
		first20WholeNumbers();
		System.out.println();
		printFirst25EvenNumbers();
		System.out.println();
		print20NumbersinReverseOrderFrom100DecreasingBy5();

	}
	
	
	public static void infiniteLoop() {
		
		int i = 1;
		while(i<10) {
		System.out.println();	//this will not stop because nothing is adding
		//we can add a break here to print only one
		}
		
	}
	public static void printFirst10Numbers() {
		int i = 1;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		
	}
	
	public static void first20WholeNumbers() {
		
		int i = 0;
		while(i<=19) {
			System.out.print(i+" ");
			i++;
		}
	}

	public static void printFirst25EvenNumbers() {
		
		int i = 2;
		while(i<=50) {
			System.out.print(i+" ");
			i = i+2;
		}
	}
	
	public static void print20NumbersinReverseOrderFrom100DecreasingBy5() {
		
		int i = 100;
		while(i>=5) {
			System.out.print(i+" ");
			i=i-5;
		
		}
	}
	
	
}
