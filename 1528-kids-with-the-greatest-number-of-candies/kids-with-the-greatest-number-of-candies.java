class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i =0;i<candies.length;i++){
            int k = candies[i]+extraCandies;
            boolean flag = true;
            for(int j =0;j<candies.length;j++){
                if(k<candies[j]){
                    flag = false;
                    break;
                }           
            }
            list.add(flag);
        }
        return list;
    }
}