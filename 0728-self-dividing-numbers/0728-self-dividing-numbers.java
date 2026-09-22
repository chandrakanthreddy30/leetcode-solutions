class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for (int i=left;i<=right;i++){
            int n=i;
            boolean bool=true;
            while(bool && n!=0){
                int rem=n%10;
                if(rem==0){
                    bool=false;
                    break;
                }
                if(rem!=0 && i%rem!=0){
                     bool=false;
                     break;
                }
                n=n/10;
            }
            if(bool==true){
                ans.add(i);
            }
        }
        return ans;
    }
}