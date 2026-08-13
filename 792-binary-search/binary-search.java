class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while(l<=r) {
            int mid=l+(r-l)/2;
            if(nums[mid]<=target) {
                l=mid+1;
            }
            else {
                r=mid-1;
            }
        }
            if(l>0 && nums[l-1]==target) {
                return l-1;
            }
            else return -1;
        
    }
}