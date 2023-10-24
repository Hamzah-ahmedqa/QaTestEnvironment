package com.javaCode_BeginningToCode;

public class ConcatenationInJava {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		String s3 = s1+" "+s2;
		String s4 = " ";
		System.out.println(s3);
		System.out.println("Hello "+s2);
        System.out.println(s1+" World");
        System.out.println(s1+" "+s2);
        System.out.println(s1+s4+s2);
        System.out.println("Hello"+s4+"World");
	}

}
