// Last updated: 27/8/2026, 9:58:05 am
class Solution {
    public int findMin(int[] nums) {
        int min =Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
        
    }
}