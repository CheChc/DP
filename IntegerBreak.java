//343
public class IntegerBreak {
    public int integerBreak(int n) {
        if (n <= 1)
            return n;
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= i - j; j++) {
                dp[i] = Math.max(Math.max((j * (i - j)), j * dp[i - j]), dp[i]);
            }
        }
        return dp[n];
    }
}
