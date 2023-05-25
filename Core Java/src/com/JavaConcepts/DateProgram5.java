package com.JavaConcepts;

import java.time.LocalDate;
import java.time.Period;

public class DateProgram5 {
public static void main(String[] args) {
	
	LocalDate date1 = LocalDate.parse("2023-05-17");
	LocalDate date2 = LocalDate.parse("2022-04-25");
	
	System.out.println("The start date: "+date1);
	System.out.println("The end date: "+date2);
	
	Period period=Period.between(date2, date1);
	System.out.println("The date difference is: "+period.getYears()+" "+period.getMonths()+" "+period.getDays()+" days");
}
}
