/**
 * 
 */
package com.kiran.java8;

/**
 * @author EazyBytes
 *
 */
public interface Vehicle {

	int getSpeed();

	void applyBreak();

	default void autoPilot() {
		System.out.println("I will help in driving with out manual support");
	}
	
	static void sayHello() {
		System.out.println("Hi, This is your favourite car");
	}
}
