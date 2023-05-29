/**
 * 49. Group Anagrams
 * 
 * Given an array of strings strs, group the anagrams together.
 * You can return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */

class GroupAnagrams {
  public List<List<String>> groupAnagrams(String[] theStrs) {
      Map<String, List<String>> anagramMap = new HashMap<>();

      for (String str : theStrs) {
          char[] chars = str.toCharArray();
          Arrays.sort(chars);
          String sortedStr = new String(chars);

          if (!anagramMap.containsKey(sortedStr))
              anagramMap.put(sortedStr, new ArrayList<>());
          anagramMap.get(sortedStr).add(str);
      }
      return new ArrayList<>(anagramMap.values());
  }
}
