class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int num=nums[i];
             int sum=0;
            while(num>=1){
                int rem=num%10;
                sum=sum+rem;
                num=num/10;
            }
            if(sum==i) return i;
        }
        return -1;
    }
}