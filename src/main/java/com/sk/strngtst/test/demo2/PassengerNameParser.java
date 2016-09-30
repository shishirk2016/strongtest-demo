/**
 * PassengerNameParser.java
 * Project strongtest-demo
 *
 * @author Shishir Kumar
 *
 * Copyright (c) 2016, Shishir Kumar.
 * All rights reserved.
 *
 */
package com.sk.strngtst.test.demo2;

public class PassengerNameParser {

    /**
     * Find person with last name.
     *
     * @param names the names
     * @param lastNameToFind the last name to find
     * @return the passenger
     */
    public Passenger findPersonWithLastName(String[] names, String lastNameToFind) {
        Passenger result = null;
        for (int i = 0; i <= names.length; i++) { // bug 1
            String[] parts = names[i].split(" ");
            String firstName = parts[0];
            String lastName = parts[1];
            if (lastName.equals(lastNameToFind)) {
                result = new Passenger(firstName, lastName);
                break;
            }
        }
        return result;
    }
}
