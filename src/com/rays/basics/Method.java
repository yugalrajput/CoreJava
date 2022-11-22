package com.rays.basics;

//Instance method
public class Method {
	// public static void main(String[] args) {
	// int n = 2;
	// int m = 3;
	// Method obj = new Method();// creating obj of method class
	 //int value = obj.sum(n, m);// function/method calling
	// System.out.println(value);
	// }

//Instance method are method which require an object of its class to find
//created before it can be called.
	// public int sum(int a, int b) {

	// return a + b;

	// }
	// Static method
	public static void main(String[] args) {
		int x = 2;
		int y = 3;

		int value = Method.sum(x, y);
		System.out.println(value);
	}

	public static int sum(int c, int d) {
		return c + d;
	}

}
