import java.util.*;
public class MakeitBeautiful{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t--!=0)
    {
        int n=sc.nextInt();
        int arr[]=new int[n];
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            set.add(arr[i]);
        }
        if(set.size()==1)
        {
            System.out.print("NO");
        }
        else
        {
            System.out.println("YES");
            Arrays.sort(arr);
            System.out.print(arr[n-1]+" ");
            for(int i=0;i<n-1;i++)
            {
                
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
}