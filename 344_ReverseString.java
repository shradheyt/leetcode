class Solution {
    public String reverseString(String s) {
        
        char[] ch = s.toCharArray();
        int j=ch.length - 1;
        for(int i=0;i < ch.length;i++,j--) {
            if(i <= j) {
                  char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            }
          
      }
        return new String(ch);
    }
}