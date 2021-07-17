package com.stefanangelov.higherorderfunction;

@FunctionalInterface
public interface IFactory<T> {
	T create();
}
