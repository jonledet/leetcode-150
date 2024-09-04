package com.jonledet.plusone;

/*
 * 66. Plus One
 *
 * Runtime:
 * 0 ms
 * Beats 100.00%
 *
 * Memory:
 * 41.51 MB
 * Beats 85.91%
 */

public class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}