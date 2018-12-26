class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x/2 + 1;
        int ans = 0;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if((long)mid*mid == x) return mid;
            else if((long)mid*mid > x) {
                high=mid-1;
            }
            else{
                ans=mid;
                low=mid+1;
            }
        }
        return ans;
        
    }
}