package com.stefanangelov.higherorderfunction;

@FunctionalInterface
public interface IConfigurator<T,R> {
	R configure(T t);
}
