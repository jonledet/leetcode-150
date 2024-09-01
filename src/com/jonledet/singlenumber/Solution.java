package com.jonledet.singlenumber;

/*
 * 136. Single Number
 *
 * Runtime:
 * 1 ms
 * Beats 99.83%
 *
 * Memory:
 * 46.18 MB
 * Beats 34.68%
 */

public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}
