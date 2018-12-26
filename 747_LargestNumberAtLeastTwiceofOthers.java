class Solution {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        int maxIndex=0;
        for(int i=0;i<nums.length;i++) {
            if(max < nums[i]){
                secondMax = max;
                max = nums[i];
                maxIndex = i;
                
            } else if(secondMax<nums[i]) {
                secondMax = nums[i];
            }
            
        }
        if(max/2 >= secondMax) return maxIndex;
        return -1;
        
    }
}