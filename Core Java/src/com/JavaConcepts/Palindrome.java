package com.JavaConcepts;
import java.util.*;

public class Palindrome {
static Scanner s=new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Enter the name to check palindrome or not:");
	String str=s.next();
	String str1="";
	for(int index=str.length()-1;index>=0;index--) {
		str1+=str.charAt(index);
	}
	String res=str1.equals(str)?"Palindrome":"Not Palindrome";
	System.out.println("The given name is: "+res);
	
//	String s2="lap";
//	StringBuilder sb=new StringBuilder(s2);
//	System.out.println(sb.reverse().toString().equals(s2));
}
}
