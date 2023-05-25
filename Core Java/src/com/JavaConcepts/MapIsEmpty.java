package com.JavaConcepts;

import java.util.HashMap;
import java.util.Map;

public class MapIsEmpty {
public static void main(String[] args) {
	Map<Integer,String> map = new HashMap<Integer,String>();
	map.put(1, "Dell");
	map.put(2, "HP");
	map.put(3, "Acer");
	map.put(4, "IMac");
	map.put(5, "Lenova");
	
	System.out.println(map);
	System.out.println();
	System.out.println("Is key 3 is present? "+map.containsKey(3));
	
	System.out.println("Is Value Hp is present? "+map.containsValue("HP"));
	System.out.println(map.isEmpty());
	}
}
