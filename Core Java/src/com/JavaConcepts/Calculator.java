package com.JavaConcepts;
import java.util.*;

public class Calculator {
static Scanner s=new Scanner(System.in);

public static void main(String[] args) {
	
	System.out.println("Enter the First number: ");
	int a=s.nextInt();
	System.out.println("Enter the Second number: ");
	int b=s.nextInt();
	System.out.println("Enter the numbers: ");
	System.out.println("1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	int num=s.nextInt();
	int c=0;
	switch(num) {
		case 1: {
			c=a+b;
			System.out.println("The addition of two number is: "+c);
			break;
		}
		case 2:{
			c=a-b;
			System.out.println("The subtraction of two number is: "+c);
			break;
		}
		case 3:{
			c=a*b;
			System.out.println("The multiplication of two number is: "+c);
			break;
		}
		case 4:{
			c=a/b;
			System.out.println("The division of two number is: "+c);
			break;
		}
		default:
			System.out.println("You entered invalid input");
		}
	}
}
