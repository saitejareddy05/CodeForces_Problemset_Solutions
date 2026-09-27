import java.util.Scanner;

public class PerfectPermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=1;
        while(t--!=0)
        {
            int n=sc.nextInt();
            if(n%2==1)
            {
                System.out.println("-1");
            }
            else
            {
                int arr[]=new int[n];
                for(int i=0;i<n;i++)
                {
                    if(i%2==0)
                    arr[i]=i+2;
                    else
                    arr[i]=i;
                }
                for(int el:arr)
                {
                    System.out.print(el+" ");
                }
                System.out.println();
            }
        }
    }
}
