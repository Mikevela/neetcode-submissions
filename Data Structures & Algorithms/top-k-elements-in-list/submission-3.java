class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        List<Integer>[] frequency = new List[nums.length + 1];

        for (int i = 0; i < frequency.length; i += 1){
            frequency[i] = new ArrayList<>();
        }

        for (int num : nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (HashMap.Entry<Integer, Integer> entry : count.entrySet()){
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
