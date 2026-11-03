class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int result = 0;

        for (int i = 0; i < heights.length; i += 1){
            int area = Math.min(heights[l], heights[r]) * (r - l);
            result = Math.max(result, area);
            if (heights[l] <= heights[r]){
                l += 1;
            } else {
                r -= 1;
            }
        }
        return result;
    }
}
