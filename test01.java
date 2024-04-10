import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        ClimbStep cli = new ClimbStep();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = cli.climbStairs(n);
        System.out.println(result);
    }
}
