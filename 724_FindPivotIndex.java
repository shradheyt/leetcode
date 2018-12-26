class Solution {
    
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            int leftSum = sum(nums,0,i-1);
            int rightSum = sum(nums,i+1,nums.length-1);
            if(leftSum == rightSum) {
                return i;
            }
            
        }
        return -1;
    }
     public static int sum(int[] arr,int start,int end) {
        int sum = 0;
        for(int i = start;i<=end;i++) {
            sum = sum + arr[i];  
        }
        return sum;
    }
}