package com.bridgelabz.findmax;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    @Test
    public void checkWhether_firstNo_isMaxInteger() {
        Maximum maximum = new Maximum();
        Integer max3= maximum.largestInteger(30,10,20);
        Integer expectation = 30;
        Assert.assertEquals(expectation,max3);
    }
    @Test
    public void checkWhether_secondNo_isMaxInteger() {
        Maximum maximum = new Maximum();
        Integer max2= maximum.largestInteger(20,30,10);
        Integer expectation = 30;
        Assert.assertEquals(expectation,max2);
    }
    @Test
    public void checkWhether_thirdNo_isMaxInteger() {
        Maximum maximum = new Maximum();
        Integer max1= maximum.largestInteger(10,20,30);
        Integer expectation = 30;
        Assert.assertEquals(expectation,max1);
    }
}
