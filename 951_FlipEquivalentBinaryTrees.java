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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        if(root1.val != root2.val) return false;
        if((flipEquiv(root1.left,root2.right) && flipEquiv(root2.left,root1.right)) || 
            (flipEquiv(root1.left,root2.left) && flipEquiv(root1.right,root2.right))) {
            return true;
        }
        return false;
    }
}