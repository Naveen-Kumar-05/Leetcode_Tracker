// Last updated: 27/8/2026, 9:57:18 am
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[]ans=new int[n*2];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
        }
        for(int i=0;i<n;i++){
            ans[n+i]=nums[n-i-1];
        }
        return ans;
    }
}