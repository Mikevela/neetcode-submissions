class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> count1 = charCount(s);
        HashMap<Character, Integer> count2 = charCount(t);
        return count1.equals(count2);
    }

    public HashMap<Character, Integer> charCount(String s){
        HashMap<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()){
            if (count.get(c) == null){
                count.put(c, 0);
            }
            count.put(c, count.get(c) + 1);
        }
        return count;
    }
}
