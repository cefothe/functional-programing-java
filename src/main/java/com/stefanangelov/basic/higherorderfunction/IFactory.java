package com.stefanangelov.basic.higherorderfunction;

@FunctionalInterface
public interface IFactory<T> {
	T create();
}
