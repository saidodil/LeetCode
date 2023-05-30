/**
 * 1047. Remove All Adjacent Duplicates In String
 * 
 * You are given a string s consisting of lowercase English letters.
 * A duplicate removal consists of choosing two adjacent and equal letters and removing them.
 * We repeatedly make duplicate removals on s until we no longer can.
 * Return the final string after all such duplicate removals have been made.
 * It can be proven that the answer is unique.
 */

class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String theS) {
        Stack<Character> stack = new Stack<>();

        for (char c : theS.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c)
                stack.pop();
            else
                stack.push(c);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack)
            sb.append(c);
        return sb.toString();
    }
}
