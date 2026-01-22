class Solution {
    public int longestOnes(int[] nums, int k) {
        int z=0;
        int l= 0;
        int mL= 0;

        for (int r= 0;r<nums.length;r++) {
            if (nums[r] == 0) z++;
            while (z > k) {
                if (nums[l] == 0) z--;
                l++;
            }
            mL = Math.max(mL,r-l+1);
        }
        return mL;
    }
}