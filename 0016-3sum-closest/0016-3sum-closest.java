class Solution {
    public int threeSumClosest(int[] nums, int target) {
       Arrays.sort(nums);
       int n=nums.length;
       int close=nums[0]+nums[1]+nums[2];
       for(int i=0;i<n-2;i++){
        if(i>0 && nums[i]==nums[i-1]) continue;
        int left=i+1;
        int right=n-1;
        while(left<right){
            int sum=nums[i]+nums[left]+nums[right];
            if(Math.abs(sum-target)<Math.abs(close-target)) {
                    close=sum;
                }
                if(sum==target) return target;
                else if(sum<target) left++;
                else right--;
        }
       }
       return close;
    }
}