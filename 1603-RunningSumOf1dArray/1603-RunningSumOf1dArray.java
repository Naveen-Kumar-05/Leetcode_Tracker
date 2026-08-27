// Last updated: 27/8/2026, 9:57:19 am
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
            
        }
        return nums;
    }
}