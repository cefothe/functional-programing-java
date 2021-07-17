package com.stefanangelov.higherorderfunction;

@FunctionalInterface
public interface IProducer<T> {
	T produce();
}
