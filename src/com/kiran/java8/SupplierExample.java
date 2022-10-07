/**
 * 
 */
package com.kiran.java8;

import java.time.LocalDate;
import java.util.function.Supplier;

/**
 * @author Kiran
 *
 */
public class SupplierExample {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creating a Supplier
		Supplier<Integer> getCurrDayOfMonth = () -> LocalDate.now().getDayOfMonth();

		Supplier<Integer> getCurrentYearSupplier = () -> LocalDate.now().getYear();

		// invoking get method inside the Supplier
		System.out.println("Today's day of the month is: "+getCurrDayOfMonth.get());
		
		// Creating a Supplier
		Supplier<String> getCurrDay = () -> LocalDate.now().getDayOfWeek().name();

		// invoking get method inside the Supplier
		System.out.println("Today's day is: "+getCurrDay.get());

		System.out.println("Current Year is : " + getCurrentYearSupplier.get());



	}

}
