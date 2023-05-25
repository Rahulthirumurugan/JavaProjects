package com.JavaConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram1 {
	
public static void main(String[] args) {
	
	ArrayList<String> list = new ArrayList<String>();
	list.add("Red");
	list.add("Blue");
	list.add("Green");
	list.add("Yellow");
	list.add("black");
	
	Iterator it=list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
