class Solution {
    public int trap(int[] height) {
        int start = 0;
        int end = height.length-1;
        int lb = height[start];
        int rb = height[end];
        int total =0;
        while(start<=end){
            if(lb<=rb){
                lb=Math.max(lb,height[start]);
                total+=lb-height[start];
                start++;
            }
            else{
                rb=Math.max(rb,height[end]);
                total+=rb-height[end];
                end--;
            }
        }
        return total;
    }
}