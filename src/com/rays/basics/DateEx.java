package com.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
public static void main(String[] args) throws ParseException{
	//gives current date in java's format
	Date d = new Date();
	System.out.println(d);	
	//Date format in to our format
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
	String str = sdf.format(d);
	System.out.println(str);
	
	//parsing date in to java format
	String a="16/11/22";
	System.out.println(a);
	Date d1 = sdf.parse(a);
	System.out.println(d1);
	
	
	
}
}
