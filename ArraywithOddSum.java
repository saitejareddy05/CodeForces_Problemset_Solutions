import java.util.Scanner;

public class ArraywithOddSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int sum=0;
            boolean even=false,odd=false;
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                if(arr[i]%2==0)
                {
                    sum+=arr[i];
                    even=true;
                }
                else
                {
                    sum+=arr[i];
                    odd=true;
                }
            }
            System.out.println(((sum%2==1)||(even&&odd))?"Yes":"No");
        }
    }
}
