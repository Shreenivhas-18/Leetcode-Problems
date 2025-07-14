class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max =-1;
        for(int i : nums){
            if(set.contains(-i)){
                max = Math.max(Math.abs(i),max);
            }
            set.add(i);
        }
        return max;
    }
}