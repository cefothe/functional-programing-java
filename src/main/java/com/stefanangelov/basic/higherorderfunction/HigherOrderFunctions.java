package com.stefanangelov.basic.higherorderfunction;

public class HigherOrderFunctions {

	public static void main(String[] args) {
		IFactory<Integer> factory = createFactory(() -> Math.random() * 100, Double::intValue);
		System.out.println(factory.create());
	}

	public static <T,R> IFactory<R> createFactory(IProducer<T> producer, IConfigurator<T,R> configurator){
		return () -> {
			T result = producer.produce();
			return configurator.configure(result);
		};
	}
}
