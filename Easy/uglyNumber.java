class Solution {
    public boolean isUgly(int n) {
        int nums[] = new int[n];
        for(int i=1;i<=n-1;i++)
        {
            int primeFact = i;
            if(n%i == 0)
            {
                nums[i] = i;
                if(nums[i] == 7)
                {
                    return false;
                }
            
            }
        }
        return true;
    }
}
