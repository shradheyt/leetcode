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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0 || preorder.length != inorder.length) {
            return null;
        }
        int pStart = 0;
        int pEnd = preorder.length - 1;
        int inStart = 0;
        int inEnd = inorder.length - 1;
        return buildTreeHelper(preorder,pStart,pEnd,inorder,inStart,inEnd);
    }
    public static TreeNode buildTreeHelper(int[] preorder, int pStart, int pEnd, int[] inorder, int inStart, int inEnd) {
        if(pStart > pEnd || inStart > inEnd) return null;
        
        int rootVal = preorder[pStart];
        TreeNode root = new TreeNode(rootVal);
        
        int k = search(inorder, rootVal);
        
        int inStartLeft = inStart;
        int inEndLeft = k - 1;
        int pStartLeft = pStart+1;
        int pEndLeft = inEndLeft - inStartLeft + pStartLeft;
        
        int inStartRight = k+1;
        int inEndRight = inEnd;
        int pEndRight = pEnd;
        int pStartRight = pEndLeft + 1;
        
        
        root.left = buildTreeHelper(preorder,pStartLeft,pEndLeft,inorder,inStartLeft,inEndLeft);
        root.right = buildTreeHelper(preorder,pStartRight,pEndRight,inorder,inStartRight,inEndRight);
        
        return root;
        
    }
    public static int search(int[] array,int target) {
        for(int i = 0;i< array.length;i++) {
            if(array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}