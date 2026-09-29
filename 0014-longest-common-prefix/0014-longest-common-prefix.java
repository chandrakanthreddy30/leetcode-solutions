class Solution {
    public String longestCommonPrefix(String[] strs) {
         int n=strs.length;
        if (strs == null || n==0){
            return "";
        }
        Arrays.sort(strs);
        String first=strs[0];
       
        String last=strs[n-1];
        int i=0;
        while(i<first.length() && i<last.length() && first.charAt(i) == last.charAt(i)){
            i++;
        }
       
        return first.substring(0,i);
    }
}