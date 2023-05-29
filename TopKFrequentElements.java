/**
 * 347. Top K Frequent Elements
 * 
 * Given an integer array nums and an integer k, return the k most frequent elements. 
 * You may return the answer in any order.
 */

class TopKFrequentElements {
  public int[] topKFrequent(int[] theNums, int theK) {
      // Create a hashmap to count frequencies
      Map<Integer, Integer> frequencyMap = new HashMap<>();
      for (int num : theNums)
          frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);

      // Create a list to store the elements
      List<Integer>[] buckets = new List[theNums.length + 1];
      for (int key : frequencyMap.keySet()) {
          int frequency = frequencyMap.get(key);
          if (buckets[frequency] == null)
              buckets[frequency] = new ArrayList<>();
          buckets[frequency].add(key);
      }

      // Create an array to store theK most frequent elements
      int[] result = new int[theK];
      int idx = 0;

      // Iterate over the buckets in reverse order and add elements to the result array
      for (int i = buckets.length - 1; i >= 0 && idx < theK; i--) {
          if (buckets[i] != null) {
              for (int num : buckets[i]) {
                  result[idx] = num;
                  idx++;
                  if (idx == theK)
                      break;
              }
          }
      }
      return result;
  }
}
