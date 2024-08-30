package com.jonledet.ispalindrome;

/*
 * 9. Palindrome Number
 *
 * Runtime:
 * 4 ms
 * Beats 100.00%
 *
 * Memory:
 * 43.98 MB
 * Beats 47.92%
 */

import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        return x == reverse(x);
    }

    public int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}
