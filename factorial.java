import java.util.Scanner;
public class factorial {
public static void main(String[] args)
{
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int fact=1;
    for(int i=1;i<=n;i++)
    {
        fact=fact*i;
        System.out.println("factorial of" +i+ "= " +fact);
    }
}
}
