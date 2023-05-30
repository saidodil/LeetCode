/**
 * 3. Longest Substring Without Repeating Characters
 * 
 * Given a string s, find the length of the longest substring  without repeating characters.
 */

class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String theS) {
        int n = theS.length();
        int maxLength = 0;
        int left = 0;
        int right = 0;
        Set<Character> uniqueChars = new HashSet<>();

        while (right < n) {
            if (uniqueChars.add(theS.charAt(right))) {
                maxLength = Math.max(maxLength, uniqueChars.size());
                right++;
            } else {
                uniqueChars.remove(theS.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}
