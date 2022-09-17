class Solution {
    public int removeElement(int[] nums, int val) {
     int i=0;
        for(int n:nums){
            if(n==val)
                continue;
            nums[i++]=n;
        }
        return i;
        
    }
}
