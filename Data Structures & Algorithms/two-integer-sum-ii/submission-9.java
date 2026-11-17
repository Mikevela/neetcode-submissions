class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> newNums = new HashMap<>();
        for (int i = 0; i < numbers.length; i += 1){
            int n = numbers[i];
            int compliment = target - n;
            if (newNums.containsKey(compliment)){
                return new int[] {newNums.get(compliment), i + 1};
            }
            newNums.put(n, i + 1);
        }
        return new int[0];
    }
}
