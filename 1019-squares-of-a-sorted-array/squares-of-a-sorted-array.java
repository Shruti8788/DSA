class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int n=nums.length;
         int r=n-1;
        int i=n-1;
        int finalArray[]=new int [n];

        while(l<=r){
            int lSquare=nums[l]*nums[l];
            int rSquare=nums[r]*nums[r];
            if(lSquare>rSquare)
              {
                finalArray[i]=lSquare;
                l++;
              }
              else{
                finalArray[i]=rSquare;
                r--;
              }
              i--;
        }
        return finalArray;

    }
}