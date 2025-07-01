class Solution {
    public int maxSubArray(int[] nums) {
        int c = nums[0];
        int k = nums[0];
        for(int i =1;i<nums.length;i++){
            c = Math.max(nums[i] , c+nums[i]);
            k = Math.max(c,k);
        }
        return k;
    }
}