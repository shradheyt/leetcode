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
    public static Map<Integer,Integer> map; 
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0 || postorder.length == 0 || inorder.length != postorder.length) return null;
        map = new HashMap();
        
        for(int i = 0;i<inorder.length;i++) {
            map.put(inorder[i], i);
        }
        
        return buildTreeHelper(inorder,0,inorder.length - 1,postorder,0,postorder.length-1);
    }
    
    public static TreeNode buildTreeHelper(int[] inorder, int iStart, int iEnd, int[] postorder, int pStart, int pEnd) {
        if(iStart > iEnd || pStart > pEnd) return null;
        
        int rootVal = postorder[pEnd];
        TreeNode root = new TreeNode(rootVal);
        
        int k = map.get(rootVal);
        
        int inStartLeft = iStart;
        int inEndLeft = k - 1;
        int inStartRight = k + 1;
        int inEndRight = iEnd;
        
        int pStartLeft = pStart;
        int pEndLeft = inEndLeft - inStartLeft + pStartLeft;
        int pStartRight = pEndLeft + 1;
        int pEndRight = pEnd - 1;
        
        root.left = buildTreeHelper(inorder,inStartLeft,inEndLeft,postorder,pStartLeft,pEndLeft);
        root.right = buildTreeHelper(inorder,inStartRight,inEndRight,postorder,pStartRight,pEndRight);
        
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