package com.JavaConcepts;
import java.util.*;

public class Factorial {
static Scanner s=new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Enter the number for factorial: ");
	int num=s.nextInt();
	int fact=1;
	for(int i=1;i<=num;i++) {
		fact*=i;
	}
	System.out.println("The factorial of given number is: "+fact);
}
}
