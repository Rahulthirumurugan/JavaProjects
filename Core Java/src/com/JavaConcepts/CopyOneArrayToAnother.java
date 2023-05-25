package com.JavaConcepts;

import java.util.*;
public class CopyOneArrayToAnother {

public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	list.add("John");
	list.add("David");
	list.add("Dravid");
	list.add("Smith");
	
	List<String> list1=new ArrayList<String>();
	list1.add("Virat");
	list1.add("Dhoni");
	list1.add("Rohith");
	list1.add("Dravid");
	
	Collections.copy(list1, list);
	System.out.println("List1: "+list);
	System.out.println("List2: "+list1);
}
}
