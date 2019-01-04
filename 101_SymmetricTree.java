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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return symetric(root.left,root.right);
    }
    // public static boolean symetric(TreeNode root1,TreeNode root2) {
    //     if(root1 == null || root2 == null) return root1 == root2;
    //     return (root1.val == root2.val) && symetric(root1.left,root2.right) && symetric(root2.left,root1.right);
    // }
    public static boolean symetric(TreeNode root1,TreeNode root2) {
        // if(root1 == null || root2 == null) return root1 == root2;
        Queue<TreeNode> q = new LinkedList();
        q.add(root1);
        q.add(root2);
        while(!q.isEmpty()) {
            TreeNode l = q.poll();
            TreeNode r = q.poll();
            if(l == null && r == null) continue;
            if(l == null || r == null || l.val != r.val) return false;
            
            q.add(l.left);q.add(r.right);
            q.add(r.left);q.add(l.right);
        }
        return true;
    }
    
}