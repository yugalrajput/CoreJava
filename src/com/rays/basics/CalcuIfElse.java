package com.rays.basics;

public class CalcuIfElse {
	public static void main(String[] args) {
		double a = 2;
		double b = 3;
		double c = '/';
		double d ;

		if (c == '+') {
		System.out.println(c = a + b);
		} else if (c == '-') {
			System.out.println(c = a - b);
		} else if (c == '*') {
			System.out.println(c = a * b);
		} else if (c == '/') {
			d = a / b;
			System.out.println(d);
		} else {
			System.out.println(c);
		}

	}
}
