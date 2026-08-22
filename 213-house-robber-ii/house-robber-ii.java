class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0 ) return 0;
        if(n==1) return nums[0];
        int p=0,c=0;
        int s=0;
        for(int i=0;i<n-1;i++){
            int t=c;
            c=Math.max(c,p+nums[i]);
            p=t;
        }
        s=c;
        p=0;
        c=0;
        for(int i=1;i<n;i++){
            int t=c;
            c=Math.max(c,p+nums[i]);
            p=t;
        }
        return Math.max(c,s);
    }
}