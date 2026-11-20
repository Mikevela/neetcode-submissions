class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) return "";

        HashMap<Character, Integer> countT = new HashMap<>();
        HashMap<Character, Integer> sWindow = new HashMap<>();

        for (char c : t.toCharArray()){
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }

        int have = 0;
        int need = countT.size();
        int[] result = {-1, -1};
        int resultLength = Integer.MAX_VALUE;
        int l = 0;

        for (int r = 0; r < s.length(); r += 1){
            char c = s.charAt(r);
            sWindow.put(c, sWindow.getOrDefault(c, 0) + 1);
            if (countT.containsKey(c) && sWindow.get(c).equals(countT.get(c))){
                have += 1;
            }
            while (have == need){
                if ((r - l + 1) < resultLength){
                    resultLength = r - l + 1;
                    result[0] = l;
                    result[1] = r;
                }
                char leftChar = s.charAt(l);
                sWindow.put(leftChar, sWindow.get(leftChar) - 1);
                if (countT.containsKey(leftChar) && sWindow.get(leftChar) < countT.get(leftChar)){
                    have -= 1;
                }
                l += 1;
            }
        }
        return resultLength == Integer.MAX_VALUE ? "" : s.substring(result[0], result[1] + 1);
    }
}
