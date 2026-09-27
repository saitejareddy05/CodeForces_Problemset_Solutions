import java.util.Scanner;

public class FavoriteSequence {
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
            }
            if(n%2==0)
            {
                int x=0,y=n-1;
                int temp=n/2;
                while(temp--!=0)
                {
                    System.out.print(arr[x++]+" "+arr[y--]+" ");
                }
            }
            else
            {
                int x=0,y=n-1;
                int temp=n/2;
                while(temp--!=0)
                {
                    System.out.print(arr[x++]+" "+arr[y--]+" ");
                }
                System.out.print(arr[x]+" ");
            }
            System.out.println();
        }
    }
}
