package com.stefanangelov.closure;

public class JavaClosure {

	public static void main(String[] args) {
		int value = 111;
		Task lambda = () -> {
			System.out.println(value);
			System.out.println("Task Completed");
		};

		printValue(lambda);
	}

	private static void printValue(Task lambda) {
		lambda.doTask();
	}

}
