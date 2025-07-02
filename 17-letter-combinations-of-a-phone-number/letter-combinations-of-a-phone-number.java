class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> list = new ArrayList<>();
        if(digits == null || digits.length()==0){
            return list;
        }
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        list.add("");
        for(int i =0;i<digits.length();i++){
            char c = digits.charAt(i);
            String s = map.get(c);
            ArrayList<String> l = new ArrayList<>();
            for(int j =0;j<list.size();j++){
                String pre = list.get(j);
                
                for(int k = 0;k<s.length();k++){
                    l.add(pre + s.charAt(k));
                }
            }
            list = l;
        }
        return list;
    }
}