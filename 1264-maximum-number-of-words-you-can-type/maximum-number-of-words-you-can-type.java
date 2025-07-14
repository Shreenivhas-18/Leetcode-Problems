class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> set = new HashSet<>();
        for(char ch : brokenLetters.toCharArray()){
            set.add(ch);
        }
        int count = 0;
        for(String m : text.split(" ")){
            boolean flag = true;
            for(char c : m.toCharArray()){
                if(set.contains(c)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}