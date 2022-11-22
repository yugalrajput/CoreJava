package com.rays.basics;

public class Constructor {
	private String Fname;
	private String Lname;
	private int id;
	
	public String getFname() {
		return Fname;

	}
	public String getLname() {
		return Lname;
		
	}
	public int id() {
		return id;
	}
	//parameterized constructor
	public Constructor(String Fname,String Lname,int id  ) {
		
		this.Fname = Fname;
		this.Lname = Lname;
		this.id   = id;
	}	
	//Default constructor
	public Constructor() {
		super();
		//ToDo Auto-generated constructor stub
		
		
	}
		
		
		
	}
