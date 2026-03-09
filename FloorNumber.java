import java.util.Scanner;

public class FloorNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0)
		{
		    int n=sc.nextInt();
            int x=sc.nextInt();
            if(n==1)
                System.out.println(1);
            else
            {
                System.out.println((int)Math.round(n/(double)x)+1);
            }
		}
    }
}
