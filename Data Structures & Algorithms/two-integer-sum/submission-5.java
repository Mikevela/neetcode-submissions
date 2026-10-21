class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> newNums = new HashMap<>();
        for (int i = 0; i < nums.length; i += 1){
            int n = nums[i];
            int compliment = target - n;
            if (newNums.containsKey(compliment)){
                return new int[] {newNums.get(compliment), i};
            }
            newNums.put(n, i);
        }
        return new int[]{};
    }
}
