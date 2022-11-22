package com.rays.basics.oop;

public class TringleEx extends ShapeInheritance {
	private int base;
	private int height;

public int getBase() {
	return base;
}
public int getHeight() {
	return height;
}
public void setBase(int base) {
	this.base=base;
}
public void sethight(int height) {
	this.height=height;

}
public double area() {
	return 0.5*base*height;
}
}
