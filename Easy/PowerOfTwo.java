
/*
 * LeetCode Problem: 231
 * Problem Name: Power of Two
 * Difficulty: Easy
 *
 * PROBLEM:
 * Check whether a given number is a power of 2.
 *
 * APPROACH:
 * 1. If n <= 0, return false.
 * 2. Divide n by 2 while it is even.
 * 3. If the final value is 1, return true.
 *
 * EXAMPLE:
 * Input: 16
 * Output: true
 *
 * DRY RUN:
 * 16 / 2 = 8
 * 8 / 2 = 4
 * 4 / 2 = 2
 * 2 / 2 = 1
 *
 * TIME COMPLEXITY: O(log n)
 * SPACE COMPLEXITY: O(1)
 */

class Solution {
    public boolean isPowerOfTwo(int n) {

        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        return n == 1;
    }
}
