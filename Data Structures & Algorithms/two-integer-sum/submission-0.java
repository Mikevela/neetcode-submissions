class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> newNums = new HashMap<>();
        for (int i = 0; i < nums.length; i += 1){
            int num = nums[i];
            int compliment = target - num;
            if (newNums.containsKey(compliment)){
                return new int[]{newNums.get(compliment), i};
            }
            newNums.put(num, i);
        }
        return null;
    }
}
