package com.rays.basics;

public class EncapsulationEx {
//Bean class private attributes and public getter/setter method
	private String fname;
	private String lname;
	private int id;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	}
	

	/*
	 * public String getFname() {// getter method return type return fname;
	 * 
	 * }
	 * 
	 * public void setFname(String Fname) {// setter method parameter data
	 * this.fname = fname; }
	 * 
	 * public String getLname() { return lname;
	 * 
	 * }
	 * 
	 * public void setlname(String Lname) { this.lname = lname; }
	 * 
	 * public int getId() { return id; }
	 * 
	 * public void setid(int id) { this.id = id;
	 * 
	 * }
	 */


