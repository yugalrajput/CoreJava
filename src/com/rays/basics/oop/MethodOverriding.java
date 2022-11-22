package com.rays.basics.oop;

public class MethodOverriding {
	public static void main(String[] args) {
		display(1);
		display(1, 4);
		display("hey", "hello", "hii");

	}

	public static void display(int i, int j) {
		System.out.println("Arguments:" + i + "&" + j);
	}

	public static void display(int s) {
		System.out.println("Arguments:" + s);
	}
public static void display(String s,String k,String m) {
	System.out.println("Arguments:"+s+","+k+","+m);
}
}
