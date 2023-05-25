package com.JavaConcepts;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateProgram6 {
public static void main(String[] args) {
	
	LocalDateTime date = LocalDateTime.now();
	
//	System.out.println(date.withDayOfMonth(24).getDayOfWeek());
	
	int n = date.getMonth().length(false);
	for(int i=1;i<=n;i++) {
		if(date.withDayOfMonth(i).getDayOfWeek().equals(date.withDayOfMonth(i).getDayOfWeek().MONDAY)||
				date.withDayOfMonth(i).getDayOfWeek().equals(date.withDayOfMonth(i).getDayOfWeek().SUNDAY)) {
			
				LocalDateTime dateAndTime=date.withDayOfMonth(i);
				DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd");
				String date1=dateAndTime.format(dtf);
				System.out.println(date1);
			}
		}
	
}
}
