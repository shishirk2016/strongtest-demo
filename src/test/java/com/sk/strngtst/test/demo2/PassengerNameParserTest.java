/**
 * PassengerNameParserTest.java
 * Project strongtest-demo
 *
 * @author Shishir Kumar
 *
 * Copyright (c) 2016, Shishir Kumar.
 * All rights reserved.
 *
 */
package com.sk.strngtst.test.demo2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PassengerNameParserTest {
    private PassengerNameParser nameParser;
    private String[] names;

    @Before
    public void setUp() {
      nameParser = new PassengerNameParser();
      names = new String[]{"Mike Jones", "John Doe"};
    }

    @Test
    public void shouldFindPersonByLastName() {
      Passenger passenger = nameParser.findPersonWithLastName(names, "Doe");
      String firstName = passenger.getFirstName();
      String lastName = passenger.getLastName();
      assertEquals("John", firstName);
    }
}
