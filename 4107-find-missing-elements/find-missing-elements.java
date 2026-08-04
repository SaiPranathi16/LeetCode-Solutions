class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int ele:nums) {
            l.add(ele);
        }
        List<Integer> res=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int s=nums[0];
        int la=nums[n-1];
        for(int i=s;i<=la;i++) {
            if(!l.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }
}