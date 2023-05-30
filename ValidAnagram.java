/**
 * 242. Valid Anagram
 * 
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */

class ValidAnagram {
    public boolean isAnagram(String theS, String theT) {
        if (theS.length() != theT.length())
            return false;

        int[] charCount = new int[26];

        // Count characters in theS
        for (char c : theS.toCharArray())
            charCount[c - 'a']++;

        // Compare character counts in theT
        for (char c : theT.toCharArray())
            charCount[c - 'a']--;

        // Check if any character count is non-zero
        for (int count : charCount) {
            if (count != 0)
                return false;
        }

        return true;
    }
}
