package com.JavaConcepts;

public class AverageOfThreeNumber {
	
	public static double computeThreeNumber(double num1,double num2,double num3) {
		
		return (num1+num2+num3)/3.0;
		
	}
	
	public static void main(String[] args) {
		double num1=25;
		double num2=45;
		double num3=65;
		double average=computeThreeNumber(num1,num2,num3);
		System.out.println(average);
	}
}
