
//given two num a and b find a raise to the power
import java.util.Scanner;

public class powerFind {
    public static void main(String[] args)
    {
    int a,b;
    System.out.println("enter the value a");
    Scanner sc = new Scanner(System.in);
    a=sc.nextInt();
    System.out.println("enter the value b");
    b=sc.nextInt();
    int ans =1;
    for(int i=1;i<=b;i++)
    {
        ans *=a;
    }
System.out.println(ans);


}
}
