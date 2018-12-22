class Solution {
    public String toLowerCase(String str) {
        String string = "";
        for(int i = 0;i<str.length();i++) {
          int aval = (int)(str.charAt(i));
           if(aval < 96 && aval > 64) {
              aval +=32;
              string += (char)(aval);
           } else {
               string += (char)(aval);
           }
              
        }
        return string;
    }
}