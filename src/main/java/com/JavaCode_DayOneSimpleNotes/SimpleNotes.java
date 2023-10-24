package com.JavaCode_DayOneSimpleNotes;
              //this is user defined , try not to make the user defined name a predefined keyword name
public class SimpleNotes { //class is a logical entitiy
	//inside the body of the entity we can put our logic
	//the main method is a logical entity
	//class is not an object 

	/*
	 * use camel case like LoginTest
	 * make sure class is named for the functionality
	 * and package is com.NameOfTheProject.Funtionality
	 * ; semi colon is the termination statement its like the period. for java
	 * make sure package is lowercase
	 * make sure class is uppercase
	 * refactor, rename - to change the name of class or package 
	 * {} brackets do not need a semi colon
	 * 
	 * 
	 */
	static MethodInDifferentClass md = new MethodInDifferentClass();
	public static void main(String[]args) {
		//this is also called the entry point of a java program
		//CAN ONLY EXECUTE IN PROGRAMS USING MAIN METHOD< AND @TEST using TestNG
		int i = 20;
		int j = 90;
		char check = '✅';
		System.out.println(i+j);
		System.out.println("✅");
		System.out.println(check);
		
		//this the main method
		//this is where we all execute code
		//methods are known as factories sometimes
		//we can call other methods here if they are static otherwise we have to create instance of the class
		notTheMainMethod();
		md.methodInDifferentClass();

	}
	//these orange words are predefined keyword in java
	public static void notTheMainMethod() {
		//we cannot execute code here
		int i =15;
		int j = 100;
		System.out.println(i + j);
		int k = 10; int l = 45; //we can do this but it's sloppy
		int m = 10, n = 100 , o = 45; //this is also sloppy
		//JAVA IS HIGH LEVEL PROGRAMMING LANGUANGE 
		//java is object oriented programming
		//never create a method inside a method
		//it will not work
		//you can call methods from other class
		
		//to use default dont write default just leave it blank
		
		//it is language binding because a lot of code has been 
		//written for the platform, in different files, packages and classes
		//those are all binded together to optimze java.
		//we can also take external libraries and bind them with java to use thier language 
		//like adding selenium in POM or testng or cucumber
		//using varies libraries to write code 
		//Control shift o
		
		
		
		//can only code in java, when you use simple java project. add library for different code
		//thats why we use maven and add dependencies instead of constantly adding libraries 
		//external software
		//selenium is a library, if we want to write selenium code we have to add the library 
		//cannot automate desktop applications, only browsers
		//we automated browser based applications ONLY
		
		//JAVA IS CASE SENSITIVE 
		
		//THATS WHY WE USE MAVEN AS A PROJECT BUILDING TOOL TO INTEGRATE EXTERNAL LIBRARIES WITHIN OUR PROJECT
		//IT CAN HOLD DEPENDENCIES AND ACCESS THEM \
		//maven is a build and compile tool
		
		//java project is dependent on other packages to write code, maven is also dependent 
		//plugin management does not exist if we do simple maven project
	}
	
	
	
}
