/**
 * 1492. The kth Factor of n
 * 
 * You are given two positive integers n and k.
 * A factor of an integer n is defined as an integer i where n % i == 0.
 * Consider a list of all factors of n sorted in ascending order, return the kth factor in this list or return -1 if n has less than k factors.
 */

class TheKthFactorOfN {
    public int kthFactor(int theN, int theK) {
        int count = 0;
        for (int i = 1; i * i <= theN; i++) {
            if (theN % i == 0) {
                count++;
                if (count == theK)
                    return i;
            }
        }
        // If n is a perfect square, don't count the square root twice.
        if ((int) Math.sqrt(theN) * (int) Math.sqrt(theN) == theN)
            count--;
        // Check the second half of factors.
        for (int i = (int) Math.sqrt(theN); i >= 1; i--) {
            if (theN % i == 0) {
                count++;
                if (count == theK)
                    return theN / i;
            }
        }
        return -1;
    }
}
