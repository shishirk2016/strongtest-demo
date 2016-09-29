/**
 * MutationInjectionDemo.java
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
public class MutationInjectionDemo {
	public enum Gender {
		MALE, FEMALE;
	}

	/**
	 * Checks if is allowed.
	 *
	 * @param age the age
	 * @param gender the gender
	 * @return true, if successful
	 */
	public boolean isAllowed(int age, Gender gender) {
		if (gender == Gender.FEMALE) {
			return age >= 18;
		} else {
			return age >= 21;
		}
	}

	/**
	 * Checks if is palindrome.
	 *
	 * @param inputString the input string
	 * @return true, if is palindrome
	 */
	public boolean isPalindrome(String inputString) {
	    if (inputString.length() == 0) {
	        return true;
	    } else {
	        char firstChar = inputString.charAt(0);
	        char lastChar = inputString.charAt(inputString.length() - 1);
	        String mid = inputString.substring(1, inputString.length() - 1);
	        return (firstChar == lastChar) && isPalindrome(mid);
	    }
	}
}
