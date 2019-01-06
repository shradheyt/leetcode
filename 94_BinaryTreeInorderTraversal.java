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
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList();
        Stack<TreeNode> s = new Stack();
        List<Integer> list = new ArrayList();
        
        while(true) {
            if(root != null) {
                s.push(root);
                root = root.left;
            } else {
                if(s.isEmpty()) break;
                TreeNode temp = s.pop();
                list.add(temp.val);
                root=temp.right;
            }
        }
        return list;
    }
}