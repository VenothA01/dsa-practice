import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Solution {


    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        int N = nums.length;

        for(int i=0;i<N;++i){

            int diff = target - nums[i];

            if(map.containsKey(nums[i])){
                return new int[]{i,map.get(diff)};
            }
            else{
                map.put(diff,i);
            }
        }

        return null;
    }

    @Test
    @DisplayName("test case 1")
    public  void test1(){
        int[] nums = {2,7,11,15};
        int target = 9;
        Assertions.assertArrayEquals(new int[]{0,1},twoSum(nums,target));
    }
}
