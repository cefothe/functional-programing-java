package com.stefanangelov.basic.higherorderfunction;

@FunctionalInterface
public interface IConfigurator<T,R> {
	R configure(T t);
}
