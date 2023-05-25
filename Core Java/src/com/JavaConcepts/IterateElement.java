package com.JavaConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class IterateElement {
public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	list.add("John");
	list.add("David");
	list.add("Dravid");
	list.add("Smith");
	
	List list1=list.stream()
		.filter(f->f.equals("John"))
		.collect(Collectors.toList());
	System.out.println(list1);
		//.forEach(m->System.out.println(m));
}
}
