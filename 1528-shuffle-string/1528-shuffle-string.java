class Solution {
    public String restoreString(String s, int[] indices) {
        int n=s.length();
        char[] str=new char[n];
        int m=indices.length;
        for(int i=0;i<m;i++){
            int ind=indices[i];
            str[ind]=s.charAt(i);
        }
        return new String(str);
    }
}