package com.jonledet.twosum;

import java.util.Map;

/*
 * 1. Two Sum
 * 
 * Runtime:
 * 2 ms
 * Beats 98.44%
 * 
 * Memory:
 * 44.57 MB
 * Beats 89.27%
 */

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return new int[]{};
    }
}
