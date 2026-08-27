// Last updated: 27/8/2026, 9:57:37 am
class Solution {
    public int singleNonDuplicate(int[] nums) {
        for(int i=0;i<nums.length-1;i+=2){
          
                if(nums[i]!=nums[i+1]){
                    return nums[i];
                    
                }
        }
        return nums[nums.length-1];
    
    }
}
