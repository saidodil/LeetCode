/**
 * 2016. Maximum Difference Between Increasing Elements
 * 
 * Given a 0-indexed integer array nums of size n, find the maximum difference between nums[i] and nums[j] (i.e., nums[j] - nums[i]), such that 0 <= i < j < n and nums[i] < nums[j].
 * Return the maximum difference. If no such i and j exists, return -1. 
 */

class MaximumDifferenceBetweenIncreasingElements {
    public int maximumDifference(int[] theNums) {
        int n = theNums.length;
        int maxDiff = -1;
        int i = 0, j = 1;

        while (j < n) {
            if (theNums[i] < theNums[j]) {
                maxDiff = Math.max(maxDiff, theNums[j] - theNums[i]);
                j++;
            } else {
                i = j;
                j++;
            }
        }
        return maxDiff;
    }
}
