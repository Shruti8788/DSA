class Solution {
    public int trap(int[] height) {
        int lM = 0, rM = 0;
        int water = 0;
        int l= 0;
        int r = height.length - 1;
    
        while (l< r) {
            if (height[l] <= height[r]) {
                if (height[l] >= lM) {
                    lM = height[l];
                } 
                else {
                    water =water+ lM - height[l];
                }
                l++;
            }
             else {
                if (height[r] >= rM) {
                    rM = height[r];
                } 
                else {
                    water += rM - height[r];
                }
                r--;
            }
        }
        return water;
    }
}
