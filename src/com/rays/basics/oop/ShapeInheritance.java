package com.rays.basics.oop;

public class ShapeInheritance {
private String colour;
private int bw;
private int side;

public int getside() {
	return side;
}
	/*
	 * public void setSide(int side) {this.side=side;
	 * 
	 * }
	 */
   public String getColour() {
	   return colour;
   }

	/*
	 * public void setColour(String colour) {this.colour=colour
	 * 
	 * }
	 */

   public int getBw() {
	return bw;   
   }
   //Default Constructor
   public ShapeInheritance() {
	   super();
	   System.out.println("Inside default Constructor");
	   //ToDo Auto generated constructor stub 
   }
   public ShapeInheritance(String colour,int bw,int side) {
	   this.colour=colour;
	   this.bw=bw;
	   this.side=side;
   }
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
   
   
   
}
