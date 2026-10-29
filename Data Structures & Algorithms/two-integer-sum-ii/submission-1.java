class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> newNums = new HashMap<>();
        for (int i = 0; i < numbers.length; i += 1){
            int num = numbers[i];
            int compliment = target - num;
            if (newNums.containsKey(compliment)){
                return new int[] {newNums.get(compliment), i + 1};
            }
            newNums.put(num, (i + 1));
        }
        return new int[0];
    }
}
