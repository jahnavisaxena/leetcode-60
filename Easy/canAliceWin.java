class Solution {
    public boolean canAliceWin(int[] nums) {
        int g=0,s=0;
        int sum =0;
        for(int i : nums)
        {
            if( i>=10)
            {
                g += i;
            }
            else{
                s+=i;
            }

        }
        return g!=s;
    }
}
