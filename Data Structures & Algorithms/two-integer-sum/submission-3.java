class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> newSum = new HashMap<>();
        for (int i = 0; i < nums.length; i += 1){
            int num = nums[i];
            int compliment = target - num;
            if (newSum.containsKey(compliment)){
                return new int[] {newSum.get(compliment), i};
            }
            newSum.put(num, i);
        }
        return new int[] {};
    }
}
