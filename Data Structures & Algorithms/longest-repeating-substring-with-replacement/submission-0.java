class Solution {
    public int characterReplacement(String s, int k) {
        int result = 0;
        HashSet<Character> charSet = new HashSet<>();
        for (char c : s.toCharArray()){
            charSet.add(c);
        }

        for (char c : charSet){
            int count = 0;
            int l = 0;
            for (int r = 0; r < s.length(); r += 1){
                if (s.charAt(r) == c){
                    count += 1;
                }
                while ((r - l + 1) - count > k){
                    if (s.charAt(l) == c){
                        count -= 1;
                    }
                    l += 1;
                }
                result = Math.max(result, r - l + 1);
            }
        }
        return result;
    }
}
