class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int i=0,j=0;
        char[] str=new char[n+m];
        int k=0;
        while(i<n && j<m){
            str[k++]=word1.charAt(i);
            str[k++]=word2.charAt(j);
            i++;
            j++;
        }
       while(i<n){
        str[k++]=word1.charAt(i);
        i++;
       }
       while(j<m){
        str[k++]=word2.charAt(j);
        j++;
       }
       return new String(str);
    }
}