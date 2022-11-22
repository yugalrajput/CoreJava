package com.rays.basics;

public class Encapsulation {
public static void main(String[] args) {
	EncapsulationEx en=new EncapsulationEx();
	en.setFname("yugal");
	en.setLname("rajput");
	en.setId(2);
	
	String fname=en.getFname();
	System.out.println(fname);
	String lname=en.getLname();
	System.out.println(lname);
	int id = en.getId();
	System.out.println(2);
	
	
	
	
	
}
}
