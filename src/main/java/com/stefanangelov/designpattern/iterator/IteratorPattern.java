package com.stefanangelov.designpattern.iterator;

public class IteratorPattern {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(new Object[]{1,2,3,4,8});
		list.forEach(System.out::println);
	}
}
