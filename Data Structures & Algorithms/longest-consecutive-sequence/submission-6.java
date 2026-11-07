class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> newNums = new HashSet<>();
        for (int n : nums){
            newNums.add(n);
        }

        int longest = 0;
        for (int n : newNums){
            if (!newNums.contains(n - 1)){
                int length = 1;
                while (newNums.contains(n + length)){
                    length += 1;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
