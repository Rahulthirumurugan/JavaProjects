package com.JavaConcepts;
import java.util.*;
public class ExceptionProgram {
static Scanner s=new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Enter you age:");
	int age=s.nextInt();
		if(age>=18)
			System.out.println("You are eligible to vote");
		else if(age<18)
			try {
				throw new InvalidAge(age);
			}catch(Exception e) {
				//System.out.println(e);
		}
	}
}

