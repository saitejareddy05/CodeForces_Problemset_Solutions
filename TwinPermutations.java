import java.util.*;

public class TwinPermutations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                arr[i]=n-arr[i]+1;
            }
            for(int el:arr)
            {
                System.out.print(el+" ");
            }
            System.out.println();
        }
    }
}
