class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> result = new HashMap<>();
        List<Integer>[] frequency = new List[nums.length + 1];

        for (int i = 0; i < frequency.length; i += 1){
            frequency[i] = new ArrayList<>();
        }

        for (int n : nums){
            result.put(n, result.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : result.entrySet()){
            frequency[entry.getValue()].add(entry.getKey());
        }

        int[] total = new int[k];
        int index = 0;
        for (int i = frequency.length - 1; i > 0 && index < k; i--){
            for (int n : frequency[i]){
                total[index++] = n;
                if (index == k){
                    return total;
                }
            }
        }
        return total;
    }
}
