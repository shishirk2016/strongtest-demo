/**
 * DiscountProviderTest.java
 * Project SimpleDemo
 *
 * @author Shishir Kumar (shishir.kumar@aurea.com)
 * 23 Sep, 2016
 */
package com.sk.strngtst.test.demo1;

import static org.assertj.core.api.Assertions.assertThat;
import static com.sk.strngtst.test.demo1.DiscountProvider.Gender.MALE;
import static com.sk.strngtst.test.demo1.DiscountProvider.Gender.FEMALE;

import org.junit.Before;
import org.junit.Test;

/**
 * @author shishir_kumar
 *
 */
public class DiscountProviderTest {
	DiscountProvider provider;

	@Before
	public void setup() {
		provider = new DiscountProvider();
	}

	@Test
	public void test21YearOldMale() {
		assertThat(provider.welcome(21, MALE)).isTrue();
	}

	@Test
	public void test19YearOldFemale() {
		assertThat(provider.welcome(19, FEMALE)).isTrue();
	}

	//@Test
	public void testAllMales() {
		assertThat(provider.welcome(17, MALE)).isFalse();
		assertThat(provider.welcome(18, MALE)).isFalse();
		assertThat(provider.welcome(19, MALE)).isFalse();
		assertThat(provider.welcome(20, MALE)).isFalse();
		assertThat(provider.welcome(21, MALE)).isTrue();
		assertThat(provider.welcome(22, MALE)).isTrue();
		assertThat(provider.welcome(17, FEMALE)).isFalse();
		assertThat(provider.welcome(18, FEMALE)).isTrue();
		assertThat(provider.welcome(19, FEMALE)).isTrue();
		assertThat(provider.welcome(20, FEMALE)).isTrue();
		assertThat(provider.welcome(21, FEMALE)).isTrue();
		assertThat(provider.welcome(22, FEMALE)).isTrue();
		assertThat(provider.welcome(17, null)).isFalse();
		assertThat(provider.welcome(18, null)).isFalse();
		assertThat(provider.welcome(19, null)).isFalse();
		assertThat(provider.welcome(20, null)).isFalse();
		assertThat(provider.welcome(21, null)).isTrue();
		assertThat(provider.welcome(22, null)).isTrue();
	}
}
