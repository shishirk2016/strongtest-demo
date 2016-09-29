/**
 * MutationInjectionDemoTest.java
 * Project SimpleDemo
 *
 * @author Shishir Kumar (shishir.kumar@aurea.com)
 * 23 Sep, 2016
 */
package com.sk.strngtst.test.demo1;

import static com.sk.strngtst.test.demo1.MutationInjectionDemo.Gender.FEMALE;
import static com.sk.strngtst.test.demo1.MutationInjectionDemo.Gender.MALE;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author shishir_kumar
 *
 */
public class MutationInjectionDemoTest {
	@Test
	public void test21YearOldMale() {
		MutationInjectionDemo demo = new MutationInjectionDemo();
		assertTrue(demo.isAllowed(21, MALE));
	}

	@Test
	public void test19YearOldFemale() {
		MutationInjectionDemo demo = new MutationInjectionDemo();
		assertTrue(demo.isAllowed(19, FEMALE));
	}

	@Test
	public void testWhenPalindrom_thenAccept() {
		MutationInjectionDemo demo = new MutationInjectionDemo();
		assertTrue(demo.isPalindrome("noon"));
	}

	// Below test cases are commented because running these test cases will kill all the mutations in above test cases and make the project strong.

	//@Test
//	public void testAllMales() {
//		assertThat(demo.welcome(17, MALE)).isFalse();
//		assertThat(demo.welcome(18, MALE)).isFalse();
//		assertThat(demo.welcome(19, MALE)).isFalse();
//		assertThat(demo.welcome(20, MALE)).isFalse();
//		assertThat(demo.welcome(21, MALE)).isTrue();
//		assertThat(demo.welcome(22, MALE)).isTrue();
//		assertThat(demo.welcome(17, FEMALE)).isFalse();
//		assertThat(demo.welcome(18, FEMALE)).isTrue();
//		assertThat(demo.welcome(19, FEMALE)).isTrue();
//		assertThat(demo.welcome(20, FEMALE)).isTrue();
//		assertThat(demo.welcome(21, FEMALE)).isTrue();
//		assertThat(demo.welcome(22, FEMALE)).isTrue();
//		assertThat(demo.welcome(17, null)).isFalse();
//		assertThat(demo.welcome(18, null)).isFalse();
//		assertThat(demo.welcome(19, null)).isFalse();
//		assertThat(demo.welcome(20, null)).isFalse();
//		assertThat(demo.welcome(21, null)).isTrue();
//		assertThat(demo.welcome(22, null)).isTrue();
//	}

//	@Test
//	public void whenNotPalindrom_thanReject() {
//	    Palindrome palindromeTester = new Palindrome();
//	    assertFalse(palindromeTester.isPalindrome("box"));
//	}
//	@Test
//	public void whenNearPalindrom_thanReject() {
//	    Palindrome palindromeTester = new Palindrome();
//	    assertFalse(palindromeTester.isPalindrome("neon"));
//	}
}
