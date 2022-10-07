/**
 * 
 */
package com.kiran.java8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

/**
 * @author Kiran
 *
 */
public class BiFunctionalExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creating a BiPredicate
		BiPredicate<Integer, Integer> isEven = (a, b) -> (a + b) % 2 == 0;

		// Calling BiPredicate method
		System.out.println("Is the sum of given numbers is even? : " + isEven.test(4, 9));

		// Creating a BiFunction
		BiFunction<Integer, Integer, Double> power = (a1, a2) -> Math.pow(a1, a2);

		BiFunction<Integer, Integer, Integer> max = (a, b) -> Math.max(a, b);

		// Calling BiFunction method
		System.out.println("The power of given numbers is : " + power.apply(4, 9));

		// Creating a Consumer
		BiConsumer<String, String> appendAndConvert = (word1, word2) -> System.out
				.println("Converted value is: " + (word1+word2).toUpperCase());

		// invoking accept method inside the Consumer
		appendAndConvert.accept("Hello ","Eazy Bytes!");


		System.out.println("The Max of given numbers is : " + max.apply(100,50));
	}

}
