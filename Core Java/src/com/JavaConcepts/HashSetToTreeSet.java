package com.JavaConcepts;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetToTreeSet {
public static void main(String[] args) {
	Set<String> set=new HashSet<String>();
	set.add("Guava");
	set.add("Apple");
	set.add("Mango");
	set.add("Bannana");
	
	System.out.println("HashSet: "+set);
	
	TreeSet<String> treeSet=new TreeSet<String>(set);
	System.out.println("TreeSet: "+treeSet);
}
}
