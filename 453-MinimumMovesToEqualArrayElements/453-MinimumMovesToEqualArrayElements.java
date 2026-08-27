// Last updated: 27/8/2026, 9:57:42 am
class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int num:nums){
            sum+=num;
        

            if(num<min){
               
              min=num;
            }
        }

        
        return sum - (min * nums.length);
        
    }
}