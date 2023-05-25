package com.JavaConcepts;
import java.util.*;

public class RemoveWhiteSpace {
static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Enter the string to remove white space");
	String s=sc.nextLine();
	System.out.println("White space has been removed: "+removeWhiteSpace(s));
	}

	public static String removeWhiteSpace(String s) {
		String[] s1=s.split(" ");
		String s2="";
		for(int index=0;index<s1.length;index++) {
			s2+=s1[index];
		}
		return s2;
		
	}
	
}

