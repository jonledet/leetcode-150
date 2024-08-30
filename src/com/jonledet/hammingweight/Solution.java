package com.jonledet.hammingweight;

/*
 * 191. Number of 1 Bits
 *
 * Runtime:
 * 0 ms
 * Beats 100.00%
 *
 * Memory:
 * 40.72 MB
 * Beats 30.38%
 */

class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n > 0) {
            if(n % 2 == 1) {
                count++;
            }
            n /= 2;
        }
        return count;
    }
}
