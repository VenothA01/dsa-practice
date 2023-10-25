package com.example.demo.dsaUtil;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxSubArrayTest {

    MaxSubArray maxSubArray = new MaxSubArray();

    @Test
    @DisplayName("Test 1")
    public void test1(){
        int[] pricces = {-2,1,-3,4,-1,2,1,-5,};
        Assertions.assertEquals(6,maxSubArray.maxSubArray(pricces));
    }

    @Test
    @DisplayName("Test 2")
    public void test2(){
        int[] pricces = {1};
        Assertions.assertEquals(1,maxSubArray.maxSubArray(pricces));
    }

    @Test
    @DisplayName("Test 3")
    public void test3(){
        int[] pricces = {5,4,-1,7,8};
        Assertions.assertEquals(23,maxSubArray.maxSubArray(pricces));
    }

}