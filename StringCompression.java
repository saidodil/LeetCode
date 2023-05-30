/**
 * 443. String Compression
 * 
 * Given an array of characters chars, compress it using the following algorithm:
 * Begin with an empty string s.
 * For each group of consecutive repeating characters in chars:
 *  1. If the group's length is 1, append the character to s.
 *  2. Otherwise, append the character followed by the group's length.
 * The compressed string s should not be returned separately, but instead, be stored in the input character array chars.
 * Note that group lengths that are 10 or longer will be split into multiple characters in chars.
 * After you are done modifying the input array, return the new length of the array.
 * You must write an algorithm that uses only constant extra space.
 */

class StringCompression {
  public int compress(char[] theChars) {
      StringBuilder s = new StringBuilder();
      s.append(theChars[0]);
      int counter = 1;
      if (theChars.length > 1) {
          for (int i = 1; i < theChars.length; i++) {
              //1-letter case
              if (theChars[i] == theChars[i - 1]) {
                  if (i == theChars.length - 1)
                      s.append(++counter);
                  else
                      counter++;
              } else {
                  if (counter > 1) {
                      s.append(counter);
                      s.append(theChars[i]);
                  } else
                      s.append(theChars[i]);
                  counter = 1;
              }
          }
          for (int i = 0; i < s.length(); i++)
              theChars[i] = s.charAt(i);
      }
      return s.length();
  }
}
