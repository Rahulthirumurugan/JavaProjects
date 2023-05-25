package com.JavaConcepts;
import java.util.*;

public class CountNoOfWords {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the String to count words and character: ");
		String str=s.nextLine();
		int count=0;
		System.out.println("Number of words to count: " +countNoOfWords(str));
		System.out.println("Number if character to count: "+countNoOfCharacters(str));
	}
	
	public static int countNoOfWords(String s) {
		String[] st= s.split(" ");
		
		return st.length;
		
	}
	
	public static int countNoOfCharacters(String str1) {
		int count=0;
		char[] ch=str1.toLowerCase().toCharArray();
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]>='a'&&ch[i]<='z')
				count++;
		}
		return count;
		
	}
}
