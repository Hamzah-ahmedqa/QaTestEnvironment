package com.javaCode_BeginningToCode;

public class MoreAboutIncrementAndDecrement {

	public static void main(String[] args) {
		int i = 1; //i is 1
		System.out.println("this is i at the first print :"+i);
		int j = i++; //i is now 2 and j is now 1 becuase that is a post increment operator and i does not share
  
		System.out.println("this is i at the 2nd print :"+i+" |and this is j's first print :"+j);
		j = ++i; //now j will take the pre increment and become 3 and i is 3
		System.out.println("i is :"+i+" |and j is :"+j);
		i = ++j ; //now they will both share the plus and i will be 4 and j will be 4
		System.out.println("i is :"+i+" |and j is :"+j);
		int k = i++ + ++i + j++; // k is 14, i is 6 and j is 5
		System.out.println("i is :"+i+" |and j is :"+j+" |and k is :"+k);
		int l = k-- - --k + i-- - --i + j++ - --j;
		System.out.println("i is :"+i+" |and j is :"+j+" |and k is :"+k+" |and this is l :"+l);
	}

}
