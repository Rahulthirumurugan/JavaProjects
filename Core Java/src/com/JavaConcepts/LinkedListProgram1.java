package com.JavaConcepts;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListProgram1 {
public static void main(String[] args) {
	List<String> list=new LinkedList<String>();
	list.add("Dell");
	list.add("HP");
	list.add("Acer");
	list.add("IMac");
	list.add("IMac");
	list.add(null);
	
	Iterator it=list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
