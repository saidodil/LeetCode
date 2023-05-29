/**
 * 1805. Number of Different Integers in a String
 * 
 * You are given a string word that consists of digits and lowercase English letters.
 * You will replace every non-digit character with a space. 
 * For example, "a123bc34d8ef34" will become " 123  34 8  34". 
 * Notice that you are left with some integers that are separated by at least one space: "123", "34", "8", and "34".
 * Return the number of different integers after performing the replacement operations on word.
 * Two integers are considered different if their decimal representations without any leading zeros are different.
 */

class NumberOfDifferentIntegersInAString {
  public int numDifferentIntegers(String theWord) {
      Set<String> distinctIntegers = new HashSet<>();
      StringBuilder currentInteger = new StringBuilder();

      for (char ch : theWord.toCharArray()) {
          if (Character.isDigit(ch))
              currentInteger.append(ch);
          else if (currentInteger.length() > 0) {
              distinctIntegers.add(removeLeadingZeros(currentInteger));
              currentInteger.setLength(0);
          }
      }

      // Process the last integer if it exists
      if (currentInteger.length() > 0)
          distinctIntegers.add(removeLeadingZeros(currentInteger));
      return distinctIntegers.size();
  }

  private String removeLeadingZeros(StringBuilder theNum) {
      int start = 0;
      while (start < theNum.length() - 1 && theNum.charAt(start) == '0')
          start++;
      return theNum.substring(start);
  }
}
