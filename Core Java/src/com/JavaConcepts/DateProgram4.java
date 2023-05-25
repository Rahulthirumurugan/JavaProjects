package com.JavaConcepts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Date;

public class DateProgram4 {
public static void main(String[] args) throws ParseException {
	String date="24/05/2023";
	Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(date);
	System.out.println(date1);
	
}
}
