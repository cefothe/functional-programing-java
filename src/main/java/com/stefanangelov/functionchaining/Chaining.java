package com.stefanangelov.functionchaining;

import java.util.function.Function;

public class Chaining {

	public static void main(String[] args) {
		Consumer<String> consumer = System.out::println;
		Consumer<String> consumer2 = System.out::println;

//		consumer.accept("Hello");
//		consumer2.accept("Hello");

		Consumer<String> consumerCombined = s -> {
			consumer.accept(s);
			consumer2.accept(s);
		};

		consumerCombined.accept("Hello");
		
		Consumer<String> consumerCombinedBestWay = consumer.thenAccept(consumer2);

		consumerCombinedBestWay.accept("BasicStrong");

		Function<Integer, Integer> f1 = s->s+2;
		Function<Integer, Integer> f2 = s->s*2;

		Function<Integer, Integer> f3 = f1.andThen(f2);
		System.out.println(f3.apply(10));
	}
}
