package com.jonledet.validanagram;

/*
 * 242. Valid Anagram
 * 
 * Runtime:
 * 2 ms
 * Beats 97.27%
 * 
 * Memory:
 * 43.03 MB
 * Beats 75.98%
 */

public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (char x : s.toCharArray()) {
            alphabet[x - 'a']++;
        }
        for (char x : t.toCharArray()) {
            alphabet[x - 'a']--;
        }
        for (int letter : alphabet) {
            if (letter != 0) {
                return false;
            }
        }
        
        return true;
    }
}
