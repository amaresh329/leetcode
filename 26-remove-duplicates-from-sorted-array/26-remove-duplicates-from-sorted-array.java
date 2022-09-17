class Solution {
    public int removeDuplicates(int[] nums) {
       int n=nums.length;
        if(n==0){
            return 0;
        }
        int count=0;
        for(int i=1;i<n;i++){
            if(nums[count]!=nums[i]){
                count++;
                nums[count]=nums[i];
            }
        }
        return count+1;
    }
}
 