// convert decimal to binary

import java.util.Scanner;
public class decimaltobinary {
    public static void main(String[] args){
    int decimal_num;
    Scanner sc = new Scanner(System.in);
    decimal_num=sc.nextInt();
    int ans=0;
    int pw=1;
    while(decimal_num>0)
    {
        int parity=decimal_num%2;
        ans +=(parity*pw);
        pw*=10;
        decimal_num/=2;

    }
        System.out.println(ans);
    }
}
/* if our input 13 then
(1*1)+(1*10)+(1*100)+(1*1000)
 */