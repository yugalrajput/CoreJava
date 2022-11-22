package com.rays.basics;

public class Arry {
	public static void main(String[] args) {
		int[] arr = new int[5];
//		ya to ye krrr lo ya fir
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;

//		ya to ye krr lo 
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int element = arr[1];
	//	System.out.println("Element as 1st index is" + element);

		int size = arr.length;
	//	System.out.println("elements of the defined arry is" + size);

		char[]copyFrom = {'y','u','g','a','l','r','x','u','g','a','l','r','x'};
		char[]copyTo = new char[3];
		System.arraycopy(copyFrom , 3 , copyTo , 0,3);
		System.out.println(copyFrom);
		System.out.println(copyTo);
		
		for(int i=0; i<5; i++) {
			
			System.out.println(i);
		}
		
		for(char c:copyTo) {
			
			System.out.println(c);
		}
		
	}

}
