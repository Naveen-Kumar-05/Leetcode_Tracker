// Last updated: 27/8/2026, 9:57:16 am
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int []ans=new int[2*n];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
            return ans;
    }
}