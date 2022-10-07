/**
 * 
 */
package com.kiran.java8.lambda;

/**
 * * @author Kiran
 *
 */
//@FunctionalInterface
public interface VoidMethodWithNoParams {

	void printHello();

	default String printHello2() {
		return "Hello";
	}

	static void printHello3(String message) {
		System.out.println(message);
	}
}
