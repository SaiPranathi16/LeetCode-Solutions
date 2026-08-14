class Solution {
    public boolean search(int[] nums, int target) {
        boolean found=false;
        Set<Integer> s=new HashSet<>();
        for(int ele:nums) {
            s.add(ele);
        }
        for(int i=0;i<s.size();i++) {
            if(s.contains(target)) {
                found=true;
            }
            else found=false;
        }
        return found;
    }
}