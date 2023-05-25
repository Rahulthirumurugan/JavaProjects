package com.JavaConcepts;
import java.util.Calendar;
public class DateProgram1 {
public static void main(String[] args) {
	Calendar calender=Calendar.getInstance();
	System.out.println("Year: "+calender.get(Calendar.YEAR));
	System.out.println("Month: "+calender.get(Calendar.MONTH));
	System.out.println("Day: "+calender.get(Calendar.DAY_OF_MONTH));
	System.out.println("Hour: "+calender.get(Calendar.HOUR));
	System.out.println("Minute: "+calender.get(Calendar.MINUTE));
	System.out.println("Seconds: "+calender.get(Calendar.SECOND));
	
}
}
