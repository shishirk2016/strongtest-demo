/**
 * MathMutationDemoTest.java
 * Project strongtest-demo
 *
 * @author Shishir Kumar
 *
 * Copyright (c) 2016, Shishir Kumar.
 * All rights reserved.
 *
 */
package com.sk.strngtst.test.demo1;

import org.junit.Assert;
import org.junit.Test;

public class MathMutationDemoTest {
    @Test
    public void testThreshold() {
        MathMutationDemo classToTest = new MathMutationDemo(10.0);
        Assert.assertTrue(classToTest.threshold(11.0));
        Assert.assertFalse(classToTest.threshold(10.0));
    }
}
