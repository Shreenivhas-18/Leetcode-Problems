class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int freq =-1;
        for(int c : map.values()){
            if(freq == -1){
                freq = c;
            }
            else if(freq!=c){
                return false;
            }
        }
        return true;
    }
}