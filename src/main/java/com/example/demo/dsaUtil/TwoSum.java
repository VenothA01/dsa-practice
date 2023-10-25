package com.example.demo.dsaUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        int N = nums.length;

        for(int i=0;i<N;++i){

            int diff = target - nums[i];

            if(map.containsKey(nums[i])){
                return new int[]{i,map.get(nums[i])};
            }
            else{
                map.put(diff,i);
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = new TwoSum().twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
