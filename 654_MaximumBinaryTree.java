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
    public Map<Integer,Integer> map = new HashMap();
    public TreeNode constructMaximumBinaryTree(int[] nums) {
      if(nums == null || nums.length == 0) return null;
      return helper(nums,0,nums.length - 1);
    }
    
    public TreeNode helper(int[] nums, int start,int end) {
      if(start > end ) return null;
      int maxIndex = max(nums,start,end);
      TreeNode root = new TreeNode(nums[maxIndex]);
      root.left = helper(nums,start,maxIndex - 1);
      root.right = helper(nums,maxIndex+1,end);
        
      return root;
        
    }
    public int max(int[] nums,int start,int end) {
        int maxIndex = start;
        for(int i=start;i<=end;i++) {
           if(nums[maxIndex] < nums[i]) {
               maxIndex = i;     
           }
        }
        return maxIndex;
    }
}