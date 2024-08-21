class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int q = m+n;
        double med;
        int nums3[] = new int[q];
        for(int i=0;i<m;i++)
        {
            nums3[i] = nums1[i];
        }
        for(int i=0;i<n;i++)
        {
            nums3[m + i] = nums2[i];
        }
        Arrays.sort(nums3);
        if(q%2 == 0)
        {
            med = (nums3[q/2-1] + nums3[q/2])/2.0;
        }
        else{
            med =nums3[q/2];
        }
        return med;
    }
}
