package com.example.demo.dsaUtil;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductArrayTest {

    ProductArray productArray = new ProductArray();


    @Test
    @DisplayName("Test 1")
    public  void test1(){
        int[] input = {1,2,3,4};
        int[] output = {24,12,8,6};

        Assertions.assertArrayEquals(output, productArray.productExceptSelf(input));
    }

}