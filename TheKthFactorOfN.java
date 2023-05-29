/**
 * 1492. The kth Factor of n
 * 
 * You are given two positive integers n and k.
 * A factor of an integer n is defined as an integer i where n % i == 0.
 * Consider a list of all factors of n sorted in ascending order, return the kth factor in this list or return -1 if n has less than k factors.
 */

class TheKthFactorOfN {
  public int kthFactor(int n, int k) {
      int count = 0;
      for (int i = 1; i * i <= n; i++) {
          if (n % i == 0) {
              count++;
              if (count == k)
                  return i;
          }
      }

      // If n is a perfect square, don't count the square root twice.
      if ((int) Math.sqrt(n) * (int) Math.sqrt(n) == n)
          count--;
      // Check the second half of factors.
      for (int i = (int) Math.sqrt(n); i >= 1; i--) {
          if (n % i == 0) {
              count++;
              if (count == k)
                  return n / i;
          }
      }
      return -1;
  }
}
