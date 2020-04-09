package com.bridgelabz.findmax;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    @Test
    public void checkWhether_firstNo_isMax() {
        Maximum maximum = new Maximum();
        Integer max3= maximum.maximumNo(30,10,20);
        Integer expectation = 30;
        Assert.assertEquals(expectation,max3);
    }
    @Test
    public void checkWhether_secondNo_isMax() {
        Maximum maximum = new Maximum();
        Integer max2= maximum.maximumNo(20,30,10);
        Integer expectation = 30;
        Assert.assertEquals(expectation,max2);
    }
    @Test
    public void checkWhether_thirdNo_isMax() {
        Maximum maximum = new Maximum();
        Integer max1= maximum.maximumNo(10,20,30);
        Integer expectation = 30;
        Assert.assertEquals(expectation,max1);
    }
}
