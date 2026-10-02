class Solution {
    public String reverseWords(String s) {
        StringBuilder str=new StringBuilder();
        int n=s.length();
        int left=0,right=0;
        while(left<n){
           right=left;
            while(right<n && s.charAt(right) != ' ' ){
                right++;
            }
            for(int i=right-1;i>=left;i--) {
                str.append(s.charAt(i));
            }
            if(right<n) {
                str.append(' ');
            }
            left=right+1;
        }
        return str.toString();
    }
}