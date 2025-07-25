class Solution {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        k%=nums.length;
        for(int m : nums){
            list.add(m);
        }
        Collections.rotate(list,k);
        for(int i =0;i<list.size();i++){
            nums[i] = list.get(i);
            
        }
        
    }
}