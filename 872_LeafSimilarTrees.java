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
    public List<Integer> l1 = new ArrayList();
    public List<Integer> l2 = new ArrayList();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
         if(root1 == null && root2 == null) return true;
       helper(root1,l1);
       helper(root2,l2);
        return l1.equals(l2);
    }
    public void helper(TreeNode root,List<Integer> l) {
        if(root == null) return;
        if(root.left == null && root.right == null) {
            l.add(root.val);
        }
        if(root.left!=null) helper(root.left,l);
        if(root.right!=null)helper(root.right,l);
        
    }        
        
}