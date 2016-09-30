/**
 * Passenger.java
 * Project strongtest-demo
 *
 * @author Shishir Kumar (shishir.kumar@aurea.com)
 * 30 Sep, 2016
 */
package com.sk.strngtst.test.demo2;

/**
 * @author shishir_kumar
 *
 */
public class Passenger {

    private String firstName;
    private String lastName;

	private int age;

	/**
     * Instantiates a new passenger.
     */
	public Passenger() {

    }

	/**
	 * Instantiates a new passenger.
	 *
	 * @param age the age
	 */
	public Passenger(int age) {
		this.age = age;
	}

	/**
     * Instantiates a new passenger.
     *
     * @param firstName the first name
     * @param lastName the last name
     */
	public Passenger(String firstName, String lastName) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	}

	/**
	 * Gets the age.
	 *
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Sets the age.
	 *
	 * @param age the new age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
