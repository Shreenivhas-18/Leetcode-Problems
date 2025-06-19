class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count =0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            count =0;
            for(int j =0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            list.add(count);
        }
        int[] k = new int[list.size()];
        for(int i =0;i<list.size();i++){
            k[i] = list.get(i);
        }
        return k;
    }
}