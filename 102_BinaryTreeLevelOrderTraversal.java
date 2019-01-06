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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            root = q.remove();
            if(root == null) {
                list.add(l);
                l = new ArrayList();
                if(!q.isEmpty()) {
                    q.add(null);
                }    
            } else {
                l.add(root.val);
                if(root.left != null) q.add(root.left);
                if(root.right != null) q.add(root.right);
            }
        }
        return list;
    }
}