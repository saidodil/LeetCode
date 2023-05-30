/**
 * 1758. Minimum Changes To Make Alternating Binary String
 * 
 * You are given a string s consisting only of the characters '0' and '1'.
 * In one operation, you can change any '0' to '1' or vice versa.
 * The string is called alternating if no two adjacent characters are equal. 
 * For example, the string "010" is alternating, while the string "0100" is not.
 * Return the minimum number of operations needed to make s alternating.
 */

class MinimumChangesToMakeAlternatingBinaryString {
    public int minOperations(String theS) {
        // Number of changes needed if starting with '1'
        int count1 = 0; 
        // Number of changes needed if starting with '0'
        int count0 = 0; 

        for (int i = 0; i < theS.length(); i++) {
            // Check if the current position should have '1'
            if (theS.charAt(i) != (i % 2 == 0 ? '1' : '0'))
                count1++;

            // Check if the current position should have '0'
            if (theS.charAt(i) != (i % 2 == 0 ? '0' : '1'))
                count0++;

        return Math.min(count1, count0);
    }
}
