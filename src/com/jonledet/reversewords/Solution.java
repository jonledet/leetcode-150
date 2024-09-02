package com.jonledet.reversewords;

/*
 * 151. Reverse Words in a String
 *
 * Runtime:
 * 6 ms
 * Beats 85.66%
 *
 * Memory:
 * 43.16 MB
 * Beats 78.21%
 */

public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] parts = s.split("\\s+");
        StringBuilder builder = new StringBuilder();
        for (int i = parts.length-1; i >= 0; i--) {
            builder.append(parts[i]);
            if (i != 0) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}
