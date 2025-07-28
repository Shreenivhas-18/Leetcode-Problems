class Solution {
    public int maximumGap(int[] nums) {
         if(nums.length<2){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i =1;i<nums.length;i++){
            if(nums[i]-nums[i-1]>max){
                max = nums[i]-nums[i-1];
            }
        }
        return max;
    }
}