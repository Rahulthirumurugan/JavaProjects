package com.JavaConcepts;

public class Animall {
	public void sound() {
		System.out.println("Animals makes a sound");
	}
}
class Bird extends Animall{
	public void sound() {
		System.out.println("Bird makes a sound");
	}
}
class Cat extends Animall{
	public void sound() {
		System.out.println("Cat meows");
	}
}
