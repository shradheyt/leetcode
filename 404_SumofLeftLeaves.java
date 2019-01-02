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
    public int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        return helper(root,sum);
        
    }
    public int helper(TreeNode root,int sum) {
        if(root == null) return sum;
        
        
        if(root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }
        sum = helper(root.left,sum);
         sum = helper(root.right,sum);
        return sum;
    }
}