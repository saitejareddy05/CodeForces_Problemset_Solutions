import java.util.Scanner;

public class CollectingCoins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0)
        {
            long sum=0;
            for(int i=0;i<4;i++)
            {
                sum+=sc.nextLong();
            }
            if(sum%3==0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
