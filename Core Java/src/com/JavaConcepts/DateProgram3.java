package com.JavaConcepts;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Calendar;

public class DateProgram3 {
public static void main(String[] args) {
//	Calendar calandar=Calendar.getInstance();
//	System.out.println(calandar.getActualMaximum(Calendar.DAY_OF_MONTH));
	
	LocalDateTime ld=LocalDateTime.now();
	int m=ld.getMonth().length(false);
	
	DayOfWeek n=ld.withDayOfMonth(m).getDayOfWeek();
	System.out.println(n);
}
}
