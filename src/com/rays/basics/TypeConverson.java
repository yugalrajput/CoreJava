package com.rays.basics;

public class TypeConverson {
  
	public static void main(String[]args) {
		
//small to big datatype conversion
//		Implicit type casting
//		int to double
		int i=5;
		System.out.println(i);
		double d=i;
		System.out.println(d);
		
	
//	big to small datatype conersion
//	Explicit type casting
//		double to int
	
	double d1=5;
	System.out.println(d1);
	int i1=(int)d1;
	System.out.println(i1);
	
//	small to big
	short s=5;
	System.out.println(s);		  
	int i2=i;
	    System.out.println(i2);
	
//	big to small
	int i3=65;
	System.out.println(i3);
	char c=(char)i3;
	System.out.println(c);
	
	
	}

	
	
}
