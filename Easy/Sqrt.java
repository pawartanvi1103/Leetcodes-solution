
/*
 * LeetCode Problem: 69
 * Problem Name: Sqrt(x)
 * Difficulty: Easy
 * Topic: Math, Loops
 *
 * PROBLEM:
 * Given a non-negative integer x,
 * return the square root of x.
 *
 * We have to return only the integer part
 * of the square root.
 *
 * APPROACH:
 * 1. Initialize ans = 0.
 * 2. Run a loop from i = 0 to x.
 * 3. Check whether i * i <= x.
 * 4. If true, store i in ans.
 * 5. If false, stop the loop.
 * 6. Finally, return ans.
 *
 * EXAMPLE:
 * Input: x = 8
 * Output: 2
 *
 * EXPLANATION:
 * 2 * 2 = 4
 * 3 * 3 = 9
 *
 * Since 9 is greater than 8,
 * the integer square root is 2.
 *
 * DRY RUN:
 * x = 8
 *
 * i = 0 → 0 * 0 = 0 <= 8 → ans = 0
 * i = 1 → 1 * 1 = 1 <= 8 → ans = 1
 * i = 2 → 2 * 2 = 4 <= 8 → ans = 2
 * i = 3 → 3 * 3 = 9 > 8 → break
 *
 * Final Answer = 2
 *
 * TIME COMPLEXITY: O(x)
 * SPACE COMPLEXITY: O(1)
 */

class Solution {
    public int mySqrt(int x) {

        int ans = 0;

        for (int i = 0; i <= x; i++) {

            if ((long) i * i <= x) {
                ans = i;
            } else {
                break;
            }
        }

        return ans;
    }
}
