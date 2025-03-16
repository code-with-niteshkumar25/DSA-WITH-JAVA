import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args)
    {
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int sumofnum=0;

        while(n>0)
        {
            sumofnum += n%10;
            n= n/10;
        }
        System.out.println(sumofnum);
    }
}
