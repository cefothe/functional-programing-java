package com.stefanangelov.currying;

import com.stefanangelov.composition.Function;

public class Currying {
	public static void main(String[] args) {
		Function<Integer, Function<Integer, Integer>> fun1 = u -> v -> u+v;
		Function<Integer, Function<Integer, Function<Integer, Integer>>> fun2 = u -> v -> z-> u+v+z;
//		Function<Integer, Integer> fun2 = fun1.apply(1);
//
//		Integer sum = fun2.apply(2);

		System.out.println(fun1.apply(1).apply(2));
		System.out.println(fun2.apply(1).apply(2).apply(12));

	}
}
