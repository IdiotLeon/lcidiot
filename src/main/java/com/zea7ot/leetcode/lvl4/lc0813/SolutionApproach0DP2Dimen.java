/**
 * https://leetcode.com/problems/largest-sum-of-averages/
 * 
 * Time Complexity:     O(N ^ 3)
 * Space Complexity:    O(N ^ 2)
 * 
 * References:
 *  https://leetcode.com/problems/largest-sum-of-averages/discuss/126280/Naive-Detailed-Step-by-Step-Approach-from-Recursive-to-DP-O(N)-solution
 *  https://youtu.be/FLbqgyJ-70I?t=6087
 */
package com.zea7ot.leetcode.lvl4.lc0813;

public class SolutionApproach0DP2Dimen {
    public double largestSumOfAverages(int[] nums, int K) {
        final int N = nums.length;

        int[] sum = new int[N];
        for (int i = 0; i < N; ++i) {
            sum[i] = nums[i] + (i > 0 ? sum[i - 1] : 0);
        }

        double[][] dp = new double[N][K + 1];
        for (int k = 1; k <= K; ++k) {
            for (int len = 0; len + k <= N; ++len) {
                if (k == 1) {
                    dp[len][k] = ((double) (sum[N - 1] - sum[len] + nums[len]) / (N - len));
                } else
                    for (int part = len; part + k <= N; ++part) {
                        dp[len][k] = Math.max(dp[len][k],
                                (dp[part + 1][k - 1] + (double) (sum[part] - sum[len] + nums[len]) / (part - len + 1)));
                    }
            }
        }

        return dp[0][K];
    }
}