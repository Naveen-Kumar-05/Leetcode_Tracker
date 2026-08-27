// Last updated: 27/8/2026, 9:57:29 am
class Solution {
    public int partitionDisjoint(int[] nums) {

        int leftMax = nums[0];
        int maxSoFar = nums[0];
        int partition = 0;

        for (int i = 1; i < nums.length; i++) {

            maxSoFar = Math.max(maxSoFar, nums[i]);

            if (nums[i] < leftMax) {
                leftMax = maxSoFar;
                partition = i;
            }
        }

        return partition + 1;
    }
}