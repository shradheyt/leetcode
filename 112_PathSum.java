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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if(root.left == null && root.right == null && root.val - sum == 0) return true;
        if(root.left != null) if(hasPathSum(root.left, sum - root.val)) return true ;
        if(root.right != null) if(hasPathSum(root.right, sum - root.val)) return true;
        return false;
    }
}