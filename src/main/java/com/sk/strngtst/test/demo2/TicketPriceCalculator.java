/**
 * TicketPriceCalculator.java
 * Project strongtest-demo
 *
 * @author Shishir Kumar (shishir.kumar@aurea.com)
 * 30-Sep-2016
 */
package com.sk.strngtst.test.demo2;

import java.util.List;

/**
 * @author shishir_kumar
 *
 */
public class TicketPriceCalculator {
	private static int ADULT_AGE = 18;
	private static int FREE_TICKET_AGE_BELOW = 3;
	public static double FAMILY_DISCOUNT = 0.05;

	/**
	 * Calculate price.
	 *
	 * @param passengers the passengers
	 * @param adultTicketPrice the adult ticket price
	 * @param childTicketPrice the child ticket price
	 * @return the double
	 */
	public double calculatePrice(List<Passenger> passengers, int adultTicketPrice, int childTicketPrice) {
		int totalPrice = 0;
		int childrenCounter = 0;
		int adultCounter = 0;
		double result;
		for (Passenger passenger : passengers) {
			if (passenger.getAge() > ADULT_AGE) {
				totalPrice += adultTicketPrice;
				adultCounter++;
			} else if (passenger.getAge() > FREE_TICKET_AGE_BELOW) {
				totalPrice += childTicketPrice;
				childrenCounter++;
			}
		}

		if (childrenCounter > 1 && adultCounter > 1) {
			result = (1 - FAMILY_DISCOUNT) * totalPrice;
		} else {
			result = totalPrice;
		}

		return result;
	}
}
