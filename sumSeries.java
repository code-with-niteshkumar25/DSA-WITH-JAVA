import java.util.Scanner;
public class sumSeries {
    public static void main(String[] args)
    {
        int n;
        int ans=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            if(i%2==0){
                ans -=i;
            }
            else {
                ans += i;
            }
        } System.out.println(ans);
    }

}
