class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> wordS = charCount(s);
        HashMap<Character, Integer> wordT = charCount(t);
        return wordS.equals(wordT);
    }

    public static HashMap<Character, Integer> charCount(String s){
        HashMap<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()){
            if (count.get(c) == null){
                count.put(c, 0);
            } else {
                count.put(c, count.get(c) + 1);
            }
        }
        return count;
    }
}
