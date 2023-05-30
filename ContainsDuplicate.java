/**
 * 217. Contains Duplicate
 * 
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */

class ContainsDuplicate {
    public boolean containsDuplicate(int[] theNums) {
        Set<Integer> set = new HashSet<>();
        for (int num : theNums) {
            if (set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }
}
