// convert binary number to decimal number
import java.util.Scanner;
public class Binarytodecimal {
    public static void main(String[] args)
    {
        int binarynum;
        Scanner sc=new Scanner(System.in);
        binarynum= sc.nextInt();
        int ans=0;
        int pw=1;
        while(binarynum>0)
        {
            int unit_digit=binarynum%10;
            ans +=(unit_digit*pw);
            binarynum/=10;
            pw*=2;
        }
        System.out.println(ans);

    }
}
