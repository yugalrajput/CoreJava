package com.rays.basics;

public class PrePostIncrement {
public static void main(String[]args) {
//	pre increment ++a
	int a=10;
	System.out.println(a);
	int b=++a;
	System.out.println(a);
	System.out.println(b);
	
//	post increment a++
	int c=12;
	System.out.println(c);
	int d=c++;
	System.out.println(c);
	System.out.println(d);
	
//	pre increment a--
	int x=5;
	System.out.println(x);
	int y=--x;
	System.out.println(x);
	System.out.println(y);
	
//	post increment a--
	int v=8;
	System.out.println(v);
	int z=v--;
	System.out.println(v);
	System.out.println(z);
	
//	new example pre increment
	int w=0;
//	System.out.println(w++ + w++ + w++ +w++ +w++);
	
//	new example post increment
//	System.out.println(++w + ++w + ++w + ++w);
//	mix
	System.out.println(++w + w++ + ++w + w++);
}

}
