class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0){
            return 0;
        }

        int l = 0;
        int r = height.length - 1;
        int leftMax = height[l];
        int rightMax = height[r];
        int result = 0;
        for (int i = 0; i < height.length; i += 1){
            while (l < r){
                if (leftMax < rightMax){
                    l += 1;
                    leftMax = Math.max(height[l], leftMax);
                    result += leftMax - height[l];
                } else {
                    r -= 1;
                    rightMax = Math.max(height[r], rightMax);
                    result += rightMax - height[r];
                }
            }
        }
        return result;
    }
}
