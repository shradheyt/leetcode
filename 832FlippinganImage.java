class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0;i<A.length;i++) {
              int j=0;
            int k = A[0].length - 1;
                while(j < k) {
                    int temp = A[i][j];
                    A[i][j]=A[i][k];
                    A[i][k]=temp;
                    j++;
                    k--;
                }
                
            
             for(int l=0;l<A[0].length;l++) {
               A[i][l] = A[i][l] == 0 ? 1 : 0;
            }
        }
        return A;
    }
}