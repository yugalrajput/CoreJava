package com.rays.basics;

public class TestStringMethod {
	public static void main(String[] args) {
		String name = "Yugal Rajput";
		System.out.println("string length : " + name.length());
		System.out.println("index character : " + name.charAt(1));
		System.out.println("character index : " + name.indexOf("j"));
		System.out.println("string index  : " + name.indexOf("Raj"));
		System.out.println("last character position of : " + name.lastIndexOf("t"));
		System.out.println("replace character : " + name.replace("Y", "A"));
		System.out.println("replace all ,matching character : " + name.replaceAll("a", "A"));
		System.out.println("convert lower case : " + name.toLowerCase());
		System.out.println("convert uper case : " + name.toUpperCase());
		System.out.println("start with string : " + name.startsWith("Yugal"));
		System.out.println("start with string : " + name.startsWith("Rajput"));
		System.out.println("end with string : " + name.endsWith("put"));
		System.out.println("return string : " + name.substring(4));
	

	}
}
