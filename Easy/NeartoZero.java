class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int closest = nums[0];
        int distance = 0;
        
        for( int i=0;i<nums.length;i++)
        {
            distance = Math.abs(nums[i]);
            if(distance < Math.abs(closest) || (distance == Math.abs(closest) && nums[i] > closest) )
            {
                closest = nums[i];
            }
        }
        return closest;
    }
}
