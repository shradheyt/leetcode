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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList();
        List<Integer> list = new ArrayList();
        Stack<TreeNode> s = new Stack();
        s.push(root);
        while(!s.isEmpty()) {
            TreeNode t = s.pop();
            list.add(t.val);
            if(t.right != null) s.push(t.right);
            if(t.left != null) s.push(t.left);
        }
        return list;
    }
}