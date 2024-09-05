package com.jonledet.majorityelement;

/*
 * 169. Majority Element
 *
 * Runtime:
 * 1 ms
 * Beats 99.78%
 *
 * Memory:
 * 52.94 MB
 * Beats 52.84%
 */

public class Solution {
    public int majorityElement(int[] nums) {
        int frequency = 0;
        int majority = 0;
        for (int num : nums) {
            if (frequency == 0) {
                majority = num;
            }
            if (num == majority) {
                frequency++;
            } else {
                frequency--;
            }
        }
        return majority;
    }
}
