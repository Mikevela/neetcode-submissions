class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> newNums = new HashSet<>();
        for (int n : nums){
            if (newNums.contains(n)){
                return true;
            }
            newNums.add(n);
        }
        return false;
    }
}