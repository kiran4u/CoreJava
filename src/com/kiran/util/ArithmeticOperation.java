/**
 * 
 */
package com.kiran.util;

/**
 * @author Kiran
 *
 */
@FunctionalInterface
public interface ArithmeticOperation {

	int performOperation(int a, int b);
	
	default void performAdd(int a, int b) {
		System.out.println(a + b);
	}

	static void printTheInput(int res) {
		System.out.println(res);
	}

}
