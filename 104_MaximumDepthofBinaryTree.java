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
    private static int answer = 0;
    private static int max(int a, int b) {
        return a > b ? a : b;
    }
    public int maxDepth(TreeNode root) {
         if(root == null) return 0;
         answer = 0;
         findDepth(root, 1);
         return answer;
    }
    private static void findDepth(TreeNode root, int depth) {
        if(root == null) return;
        if(root.left == null && root.right == null) {
            answer = max(answer, depth);
        }
        findDepth(root.left, depth+1);
        findDepth(root.right, depth+1);
    }
}