/**
 * DiscountProvider.java
 * Project SimpleDemo
 *
 * @author Shishir Kumar (shishir.kumar@aurea.com)
 * 23 Sep, 2016
 */
package com.sk.strngtst.test.demo1;

/**
 * @author shishir_kumar
 *
 */
public class DiscountProvider {
	public enum Gender {
		MALE, FEMALE;
	}

	/**
	 * Welcome.
	 *
	 * @param age the age
	 * @param gender the gender
	 * @return true, if successful
	 */
	public boolean welcome(int age, Gender gender) {
		if (gender == Gender.FEMALE) {
			return age >= 18;
		} else {
			return age >= 21;
		}
	}
}
