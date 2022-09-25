class Solution {
    public int findMin(int[] nums) {
    //     int li=0;
    // int ri=arr.length-1;
    // while(li<ri){
    //     int mid=(li+ri)/2;
    //     if(arr[mid]>arr[ri]){
    //         li=mid+1;
    //     }
    //     else if(arr[mid]<arr[ri]){
    //         ri=mid;
    //     }
    // }
    // return arr[li];
    Arrays.sort(nums);
        return nums[0];
    }
}