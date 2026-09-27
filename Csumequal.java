import java.util.Scanner;
public class Csumequal{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int ans=solve(a,b,n);
            System.out.println(ans);
        }
    }
    static int solve(int a,int b,int n)
    {
        int ans=0;
        while(a<=n&&b<=n)
        {
            if(a<b)
            {
                a+=b;
            }
            else
            {
                b+=a;
            }
            ans++;
        }
        return ans;
    }
}
