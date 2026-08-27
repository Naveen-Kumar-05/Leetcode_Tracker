// Last updated: 27/8/2026, 9:57:22 am
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int digit=String.valueOf(nums[i]).length();
            if(digit%2==0){
            count++;
            }
             }
        return count;
        
    }
}