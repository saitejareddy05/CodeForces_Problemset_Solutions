import java.util.*;
public class CoverinWater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
            int n=sc.nextInt();
            String str=sc.next();
            int idx=0;
            int ans=0;
            while(idx<n-1)
                {
                int cnt=0;
                while(idx<n&&str.charAt(idx)!='#')
                {
                    cnt++;
                    idx++;
                }
                if(cnt==1||cnt==2)
                    ans+=1;
                idx++;
            }
            System.out.println(ans);
        }
    }
}
