class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> newNums = new HashMap<>();
        List<Integer>[] frequency = new List[nums.length + 1];

        for (int i = 0; i < frequency.length; i += 1){
            frequency[i] = new ArrayList<>();
        }

        for (int n : nums){
            newNums.put(n, newNums.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : newNums.entrySet()){
            frequency[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int index = 0;
        for (int i = frequency.length - 1; i > 0 && index < k; i -= 1){
            for (int n : frequency[i]){
                result[index++] = n;
                if (index == k){
                    return result;
                }
            }
        }
        return result;
    }
}
