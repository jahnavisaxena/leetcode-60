class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int streak = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 1)
            {
                streak++;
                max = Math.max(max,streak);
            }
            else{
                streak = 0;
            }
            
        }
        return max;
    }
}
