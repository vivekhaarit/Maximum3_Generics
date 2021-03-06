package com.bridgelabz.findmax;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    @Test
    public void checkWhether_firstNo_isMaxInteger() {
        Maximum maximum = new Maximum();
        Integer max3= maximum.maximumValue(30,10,20);
        Integer expectation = 30;
        Assert.assertEquals(expectation,max3);
    }
    @Test
    public void checkWhether_secondNo_isMaxInteger() {
        Maximum maximum = new Maximum();
        Integer max2= maximum.maximumValue(20,30,10);
        Integer expectation = 30;
        Assert.assertEquals(expectation,max2);
    }
    @Test
    public void checkWhether_thirdNo_isMaxInteger() {
        Maximum maximum = new Maximum();
        Integer max1= maximum.maximumValue(10,20,30);
        Integer expectation = 30;
        Assert.assertEquals(expectation,max1);
    }
    @Test
    public void checkWhether_firstNo_isMaxFloat() {
        Maximum maximum = new Maximum();
        Float max3= maximum.maximumValue(30.1f,10.2f,20.5f);
        Float expectation = 30.1f;
        Assert.assertEquals(expectation,max3);
    }
    @Test
    public void checkWhether_secondNo_isMaxFloat() {
        Maximum maximum = new Maximum();
        Float max2= maximum.maximumValue(20.5f,30.1f,10.2f);
        Float expectation = 30.1f;
        Assert.assertEquals(expectation,max2);
    }
    @Test
    public void checkWhether_thirdNo_isMaxFloat() {
        Maximum maximum = new Maximum();
        Float max1= maximum.maximumValue(10.2f,20.5f,30.1f);
        Float expectation = 30.1f;
        Assert.assertEquals(expectation,max1);
    }

    @Test
    public void checkWhether_firstString_isMaxString() {
        Maximum maximum = new Maximum();
        String max3= maximum.maximumValue("Apple","Peach","Banana");
        String expectation = "Peach";
        Assert.assertEquals(expectation,max3);
    }
    @Test
    public void checkWhether_secondString_isMaxString() {
        Maximum maximum = new Maximum();
        String max2= maximum.maximumValue("Peach","Banana","Apple");
        String expectation = "Peach";
        Assert.assertEquals(expectation,max2);
    }
    @Test
    public void checkWhether_thirdString_isMaxString() {
        Maximum maximum = new Maximum();
        String max1= maximum.maximumValue("Banana","Apple","Peach");
        String expectation = "Peach";
        Assert.assertEquals(expectation,max1);
    }
}
