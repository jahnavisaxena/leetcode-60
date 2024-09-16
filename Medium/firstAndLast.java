class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end)
        {
            int mid = (start+end)/2;
            if(nums[mid] ==target)
            {
                return new int []{mid};
            }
             if(nums[mid] > target){
                end =mid-1;
            }
            else{
                start = mid +1;
            }
        }
        return new int []{-1,-1};
    }
}
