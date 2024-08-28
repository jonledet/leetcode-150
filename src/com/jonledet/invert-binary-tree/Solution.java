package com.jonledet.invert-binary-tree;

import com.jonledet.types.TreeNode;

/*
 * 226. Invert Binary Tree
 * 
 * Runtime:
 * 0 ms
 * Beats 100.00%
 * 
 * Memory:
 * 41.08 MB
 * Beats 47.13%
 */

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = invertTree(root.right);
        TreeNode right = invertTree(root.left);
        
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        return root;
    }
}
