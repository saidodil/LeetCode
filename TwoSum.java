/**
 * 1. Two Sum
 * 
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */

class TwoSum {
    public int[] twoSum(int[] theNums, int theTarget) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < theNums.length; i++) {
            int complement = theTarget - theNums[i];
            if (numMap.containsKey(complement))
                return new int[] { numMap.get(complement), i };
            numMap.put(theNums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
