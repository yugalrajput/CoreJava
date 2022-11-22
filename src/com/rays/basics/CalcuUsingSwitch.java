package com.rays.basics;

public class CalcuUsingSwitch {
	public static void main(String[] args) {
		double a = 10;
		double b = 60;
		String d = "/";
		double c  ;
		switch (d) {
		case "+":
			System.out.println(c =a+b);
			break;

		case "-":
			System.out.println(c = a - b);
			break;

		case "*":
			System.out.println(c = a * b);
			break;

		case "/":
			System.out.println(c = a / b);
			break;
		default:
			System.out.println("default");

		}

	}
}
