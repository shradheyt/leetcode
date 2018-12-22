class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
         
             for(int j = 0;j < S.length();j++) {
                 if(J.indexOf(S.charAt(j)) > -1) {
                     count++;
                 }
             }
        
        return count;
        
    }
}