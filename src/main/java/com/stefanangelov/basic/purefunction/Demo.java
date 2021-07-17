package com.stefanangelov.basic.purefunction;

public class Demo {

	public static void main(String[] args) {
		int result = add(multiply(2, 3), multiply(3, 4));
		System.out.println(result);
	}
	public static int add(int a, int b){
		return a+b;
	}

	/**
	 * Not a pure function because log something in the screen
	 */
	public static int multiply(int a, int b){
		log(String.format("Returning %s as the result of %s * %s", a*b, a,b));
		return a*b;
	}

	/**
	 * It is not a pure function because not returned value and there is a side affect
	 */
	public static void log(String message){
		System.out.println(message);
	}
}
