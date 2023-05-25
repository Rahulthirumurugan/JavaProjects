package com.JavaConcepts;

import java.util.ArrayList;
import java.util.List;

public class JoininTwoArray {
public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	list.add("Red");
	list.add("Blue");
	list.add("Green");
	
	List<String> list1=new ArrayList<String>();
	list1.add("Yellow");
	list1.add("black");
	list1.add("white");
	
	list.addAll(list1);
	System.out.println(list);
}
}
