/**
 * MathMutationDemo.java
 * Project strongtest-demo
 *
 * @author Shishir Kumar
 *
 * Copyright (c) 2016, Shishir Kumar.
 * All rights reserved.
 *
 */
package com.sk.strngtst.test.demo1;

public class MathMutationDemo {
    private int invocationCount = 0;

    private static final double OFFSET = 1.0;
    private final double threshold;

    /**
     * Instantiates a new math mutation demo.
     *
     * @param threshold the threshold
     */
    public MathMutationDemo(double threshold) {
        this.threshold = threshold;
    }

    /**
     * Threshold.
     *
     * @param value the value
     * @return true, if successful
     */
    public boolean threshold(double value) {
        logInvocation();
        return value >= threshold + OFFSET;
    }

    /**
     * Log invocation.
     */
    private void logInvocation() {
        invocationCount++;
    }
}
