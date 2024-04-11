import java.util.Scanner;
public class Bag01 {
    public int bag01(int kindnum,int bagweight,int[] weight,int[] value)
    {
        int[][] dp=new int[kindnum+1][bagweight+1];
        for(int i=0;i<=bagweight;i++)
        {
            if(i>=weight[0])
                dp[0][i]=value[0];
        }
        for(int i=1;i<=kindnum;i++)
        {
            for(int j=1;j<=bagweight;j++)
            {
                dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-weight[i]]+value[i]);
            }
        }
        return dp[kindnum][bagweight];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int kindnum=sc.nextInt();
        int bagweight=sc.nextInt();
        int[] weight=new int[kindnum];
        int[] value=new int[kindnum];
        for(int i=0;i<kindnum;i++)
        {
            weight[i]=sc.nextInt();
        }
        for(int i=0;i<kindnum;i++)
        {
            value[i]=sc.nextInt();
        }
        Bag01 ba=new Bag01();
        System.out.println(ba.bag01(kindnum,bagweight,weight,value));
    }
}
