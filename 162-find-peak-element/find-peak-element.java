class Solution {
    public int findPeakElement(int[] nums) {
        int start=1,end=nums.length-2;
       int len=nums.length;
        if(len==1){
            return 0;
        }
        if(nums[0]>nums[1]) return 0;
        if(nums[len-1]>nums[len-2]) return len-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[mid]>nums[mid-1]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}