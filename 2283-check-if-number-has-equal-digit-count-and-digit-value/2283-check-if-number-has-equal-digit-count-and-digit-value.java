class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer,Integer>  map=new HashMap<>();
        int n=num.length();
        for(int i=0;i<n;i++){
           char ch=num.charAt(i);
           int temp=ch-'0';
           map.put(temp,map.getOrDefault(temp,0)+1);
        }
        for(int i=0;i<n;i++){
            int count=num.charAt(i) - '0';
            int actual=map.getOrDefault(i, 0);
            if(count!=actual){
                return false;
            }
        }
        return true;
    }
}