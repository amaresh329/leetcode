class Solution {
    public void moveZeroes(int[] nums) {
         int count=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr[count]=nums[i];
                count++;
            }
        }
            for(int i=count;i<nums.length;i++){
                arr[i]=0;
            }
            for(int i=0;i<nums.length;i++){
                nums[i]=arr[i];
            }
    }
}