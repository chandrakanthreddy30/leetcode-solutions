class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int sum=0;
        for (int i=0;i<n;i++){
            char ch=s.charAt(i);
            int num=26-(int)(ch-'a');
            sum=sum+num*(i+1);
        }
        return sum;
    }
}