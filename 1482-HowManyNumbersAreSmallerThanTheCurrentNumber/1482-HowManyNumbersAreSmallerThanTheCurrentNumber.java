// Last updated: 27/8/2026, 9:57:15 am
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int []result= new int[nums.length];
        for (int i=0;i<nums.length;i++){
        int count =0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            result[i]=count;
            }
        return result;
    }
}    
        