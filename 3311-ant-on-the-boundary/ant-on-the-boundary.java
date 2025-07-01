class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int boundry = 0;
        int count =0;
        for(int i : nums){
            boundry+=i;
            if(boundry == 0){
                count++;
            }
        }
        return count;
    }
}