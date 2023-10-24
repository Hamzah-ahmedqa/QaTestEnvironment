package com.javaCode_BeginningToCode;

public class LearningDataTypes {

	//the eight primitive data types are
	/*
	 * boolean -1 bit - primitive - true or false
	 * byte - 1 byte - primitive - (-128 to 127)
	 * short - 2 bytes - primitive - (-32,768 to 32,767)
	 * int - 4 bytes - primitive - (-2 billion to 2 billion)
	 * long -8 bytes - primitive - (-9quintillion to 9 quintillion)
	 * float - 4bytes - primitive - (fractional number up to 6-7 digits)
	 * double - 8 bytes - primitive - (fractional number up to 15 digits)
	 * char - 2 bytes - primitive - single character
	 * String -varies - reference - a sequence of characters it can be anything
	 */
		//unlimited amount of reference data types
		//reference are slower compared to primitive, 
		//reference take more memory
	
	//non primitive data types
	/*
	 * strings
	 * arrays
	 * classes
	 * structures
	 */
	
	
	public static void main(String[] args) {
	
		int i =10;
		int i1 = 12, i2 = 13, i3 = 14;
		System.out.println(i3);
		boolean b1 = false;
		boolean b2 = true;
		boolean b3 = 2<3; //this is true so it can accept conditions
		char c = '@' , c1 = '#' , c3  = 'p';
		
		//lets change i to 11
		//we cannot change it to 11 directly like this:
	//	int i =11; this will throw an error so we have increment it by 1 by doing ++
		//or i = i +30 or whatever;
		//or we can directly change it 
		//or like 
		i = 11; //dont need to directly intialize it again
		i++;
		//String is the only data type in java that is also a class
		String s1 = "Hi bastard";
		String s2 = "@#! high friend....."; 
		String name = "Humza";
		

	}

}
