class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet();
        String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String word: words) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i < word.length();i++) {
                
                int letterIndex = (int)word.charAt(i) - 97;
                sb.append(morse[letterIndex]);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}