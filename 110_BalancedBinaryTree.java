/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int factor = helper(root);
        if(factor == -1) return false;
        return true;
    }
    public int helper(TreeNode root) {
        if(root == null) return 0;
        int heightLeft = helper(root.left);
        if(heightLeft == -1) return -1;
        int heightRight = helper(root.right);
        if(heightRight == -1) return -1;
        if(Math.abs(heightLeft - heightRight) > 1)
            return -1;
        return 1 +Math.max(heightLeft,heightRight);
    }
}