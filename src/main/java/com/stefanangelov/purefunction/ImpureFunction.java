package com.stefanangelov.purefunction;

/**
 * Not a pure function
 */
public class ImpureFunction {

	private int value = 0;

	public int add(int nextValue){
		this.value += nextValue;
		return this.value;
	}
}
