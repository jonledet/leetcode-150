package com.jonledet.length-of-last-word;

/*
 * 58. Length of Last Word
 * 
 * Runtime:
 * 0 ms
 * Beats 100.00%
 * 
 * Memory:
 * 41.63 MB
 * Beats 48.88%
 */

public class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            else if (length > 0) {
                break;
            }
        }
        return length;
    }
}
