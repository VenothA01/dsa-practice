package com.example.demo.dsaUtil;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContainerWithMostWaterTest {

    ContainerWithMostWater container  = new ContainerWithMostWater();

    @Test
    @DisplayName("Test 1")
    public void test1(){
        int[] h = {1,8,6,2,5,4,8,3,7};
        Assertions.assertEquals(49,container.maxArea(h));
    }

    @Test
    @DisplayName("Test 2")
    public void test2(){
        int[] h = {1,1};
        Assertions.assertEquals(1,container.maxArea(h));
    }

}