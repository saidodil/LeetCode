/**
 * 14. Longest Common Prefix
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 */

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] theStrs) {
        if (theStrs == null || theStrs.length == 0)
            return "";

        String prefix = theStrs[0];

        for (int i = 1; i < theStrs.length; i++) {
            while (theStrs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
}
