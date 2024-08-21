class Solution {
    public int maxSubArray(int[] nums) {
      int sum =0;
      int max_value = Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++)
      {
        sum = sum + nums[i];
        if(sum > max_value)
        {
            max_value= sum;
        }
        if(sum < 0)
        {
            sum = 0;
        }
      }
      return max_value;
    }
    
}
