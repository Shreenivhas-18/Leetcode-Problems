class Solution {
    public boolean isPalindrome(String s) {
        String k ="";
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if((ch>=65 && ch<=90) || (ch>=97 &&ch<=122)||(ch>=48 &&ch<=57)){
                k+=ch;
            }
        }
        k = k.toLowerCase();
        char[] arr = k.toCharArray();
        int i =0;
        int j = arr.length-1;
        boolean flag = true;
        while(i<j){
            if(arr[i]!=arr[j]){
                flag = false;
            }
            i++;
            j--;
        }
        return flag;
    }
}