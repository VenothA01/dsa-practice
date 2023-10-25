package com.example.demo.dsaUtil;

public class MaxSubArray {

    public int maxSubArray(int[] nums) {

        int max_so_far = Integer.MIN_VALUE;
        int sum = 0;
        int N = nums.length;

        for(int i=0;i<N;++i){

            sum += nums[i];

            if(max_so_far < sum)
               max_so_far = sum;

            if(sum < 0)
                sum = 0;
        }

        return max_so_far;
    }

}
