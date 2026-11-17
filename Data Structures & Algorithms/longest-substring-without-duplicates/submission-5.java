class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        int l = 0;
        int result = 0;
        for (int r = 0; r < s.length(); r += 1){
            if (charCount.containsKey(s.charAt(r))){
                l = Math.max(charCount.get(s.charAt(r)) + 1, l);
            }
            charCount.put(s.charAt(r), r);
            result = Math.max(result, r - l + 1);
        }
        return result;
    }
}
