// Last updated: 27/8/2026, 9:58:00 am
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while(left<right){
        int sum=(numbers[left]+numbers[right]);
        if(sum==target){
            return new int[]{left+1,right+1};
        }else if(sum>target){
            right--;
        }else{
            left++;
        }
        }
        return new int[]{};
        
    }
}