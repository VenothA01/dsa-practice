package com.example.demo.dsaUtil;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxProfitTest {

    MaxProfit maxProfit = new MaxProfit();

    @Test
    @DisplayName("Test 1")
    public void test1(){
        int[] pricces = {7,1,5,3,6,4};
        Assertions.assertEquals(5,maxProfit.maxProfit(pricces));
    }

    @Test
    @DisplayName("Test 2")
    public void test2(){
        int[] pricces = {7,6,4,3,1};
        Assertions.assertEquals(0,maxProfit.maxProfit(pricces));
    }




}