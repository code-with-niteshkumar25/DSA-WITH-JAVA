import java.util.Scanner;
public class Reversdigit {
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int input=n;
        int ans=0;
         while(n>0)
         {
             ans=ans*10+n%10;
            n= n/10;

         }
         System.out.println("Revers digit" +input+" = " + ans );



    }
}
