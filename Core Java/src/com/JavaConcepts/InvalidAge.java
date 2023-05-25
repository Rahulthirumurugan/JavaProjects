package com.JavaConcepts;

public class InvalidAge extends Exception {
	
	InvalidAge(int a){
		System.out.println("You are not eligible,since your age is : "+a);
	}

}
