package com.JavaConcepts;

import java.util.HashSet;
import java.util.Set;

public class HashSetToArray {
public static void main(String[] args) {
	Set<String> set=new HashSet<String>();
	set.add("1");
	set.add("2");
	set.add("3");
	set.add("4");
	System.out.println("Set: "+set);
	String arr[]=new String[set.size()];
	int i=0;
	for(String set1:set) {
		arr[i++]=set1;
	}
	System.out.println("Coverting Set to Array:");
	for(String ele:arr) {
		System.out.print(ele+" ");
	}
	
	
}
}
