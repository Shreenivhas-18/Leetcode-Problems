class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefix = new int[gain.length];
        // prefix[0] = gain[0];
        // for(int i =1;i<prefix.length;i++){
        //     prefix[i] = prefix[i-1]+gain[i];
        // }
        // int max = Integer.MIN_VALUE;
        // for(int i =0;i<prefix.length;i++){
        //     if(prefix[i]>max){
        //         max = prefix[i];
        //     }
        // }
        // return max;
        int al = 0;
        int max =0;
        for(int i : gain){
            al+=i;
            max = Math.max(max,al);
        }
        return max;
    }
}