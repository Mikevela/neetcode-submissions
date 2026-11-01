class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> result = new HashSet<>();
        for (int n : nums){
            result.add(n);
        }

        int longest = 0;
        for (int n : result){
            if (!result.contains(n - 1)){
                int length = 1;
                while (result.contains(n + length)){
                    length += 1;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
