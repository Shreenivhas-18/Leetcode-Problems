class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int i =0;
        int j =0;
        int max = 0;
        int sum =0;
        while(j!=costs.length){
            sum+=costs[j];
            while(sum>coins && i<=j){
                sum-=costs[i];
                i++;
            }
            if(sum<= coins){
                max = Math.max(max, j-i+1);
            }
            j++;
        }
        return max;
    }
}