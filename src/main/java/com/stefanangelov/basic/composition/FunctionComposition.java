package com.stefanangelov.basic.composition;

public class FunctionComposition {
	public static void main(String[] args) {
		Function<Square, Integer> fun1 = Square::getArea;
		Function<Integer, Double> fun2 = Math::sqrt;
		Function<Square, Double> getSide = fun2.compose(fun1);
		Square square = new Square();
		square.setArea(100);
		System.out.println(getSide.apply(square));
	}
}
