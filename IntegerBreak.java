public class IntegerBreak {
    public int integerBreak(int n) {
        if(n<=1)
            return n;
    int[] dp=new int[n+1];
    dp[2]=1;
    for(int i=3;i<=n;i++)
    {
        dp[n]=Math.max((i*(n-i)),i*dp[n-i]);
    }
    return dp[n];
    }
}
