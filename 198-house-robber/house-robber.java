class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(nums==null || nums.length==0) return 0;
        if(n==1) return nums[0];
        int p=0,c=0;
        for(int i=0;i<n;i++){
            int t=c;
            c=Math.max(c,p+nums[i]);
            p=t;
        }
            return c;
    }
}