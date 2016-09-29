/**
 * TicketPriceCalculatorTest.java
 * Project strongtest-demo
 *
 * @author Shishir Kumar (shishir.kumar@aurea.com)
 * 30-Sep-2016
 */
package com.sk.strngtst.test.demo2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @author shishir_kumar
 *
 */
public class TicketPriceCalculatorTest {
	private static int ADULT_TICKET_PRICE = 40;
    private static int CHILD_TICKER_PRICE = 20;
    private TicketPriceCalculator calculator = new TicketPriceCalculator();

    /**
     * Calculate price for one adult.
     */
    @Test
    public void testCalculatePriceForOneAdult() {
        List<Passenger> passengers = new ArrayList<Passenger>();
        Passenger passenger = new Passenger(20);
        passengers.add(passenger);
        double price = calculator.calculatePrice(passengers, ADULT_TICKET_PRICE, CHILD_TICKER_PRICE);
        assertEquals(ADULT_TICKET_PRICE, price, 0);
    }

    /**
     * Calculate price for child.
     */
    @Test
    public void testCalculatePriceForChild() {
        List<Passenger> passengers = new ArrayList<Passenger>();
        Passenger childPassenger = new Passenger(15);
        passengers.add(childPassenger);
        double price = calculator.calculatePrice(passengers, ADULT_TICKET_PRICE, CHILD_TICKER_PRICE);
        assertEquals(CHILD_TICKER_PRICE, price, 0);
    }

	// Below test case is commented because running it will kill all the mutations in above test cases and make the project strong.


//    /**
//     * Calculate price for family.
//     */
//    @Test
//    public void testCalculatePriceForFamily() {
//        List<Passenger> passengers = new ArrayList<Passenger>();
//        Passenger adultPassenger1 = new Passenger(20);
//        Passenger adultPassenger2 = new Passenger(20);
//        Passenger childPassenger3 = new Passenger(12);
//        Passenger childPassenger4 = new Passenger(4);
//        passengers.add(adultPassenger1);
//        passengers.add(adultPassenger2);
//        passengers.add(childPassenger3);
//        passengers.add(childPassenger4);
//        double price = calculator.calculatePrice(passengers, ADULT_TICKET_PRICE, CHILD_TICKER_PRICE);
//        assertEquals((2 * ADULT_TICKET_PRICE + 2 * CHILD_TICKER_PRICE) *
//                (1 - TicketPriceCalculator.FAMILY_DISCOUNT), price, 0);
//    }
}
