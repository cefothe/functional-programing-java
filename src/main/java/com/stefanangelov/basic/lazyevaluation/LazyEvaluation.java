package com.stefanangelov.basic.lazyevaluation;

public class LazyEvaluation {
	public static void main(String[] args) {
		Runnable person = () -> new Person("Ivan", 34);

		person.run();

	}
}

class Person{
	private String name;
	private int age;

	public Person(String name, int age) {
		System.out.println("Initialization");
		this.name = name;
		this.age = age;
	}
}
