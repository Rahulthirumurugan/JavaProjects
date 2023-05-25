package com.JavaConcepts;

public class PrimitiveToWrapper {
public static void main(String[] args) {
	int primitive=15;
	Integer nonPrimtive=Integer.valueOf(primitive);
	System.out.println("Primitive: "+primitive);
	System.out.println("Wrapper: "+nonPrimtive);
}
}
