class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] rows=new int[n][2];
        for(int i=0;i<n;i++){
            int low=0;
            int high=m-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(mat[i][mid]==1){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            rows[i][0] = low; 
            rows[i][1] = i; 
        }
         Arrays.sort(rows, (a, b) -> {
            if(a[0] != b[0])
                return a[0] - b[0];

            return a[1] - b[1];
        });
        int[] ans=new int[k];
         for(int i = 0; i < k; i++) {
            ans[i] = rows[i][1];
        }
        return ans;
    }
}