// Last updated: 27/8/2026, 9:58:16 am
class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
                
            }
        }
            return k;
    }
}