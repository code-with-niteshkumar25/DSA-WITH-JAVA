
import java.util.Scanner;
public class Countdigit {

    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        int countdi=0;
        int num=n;
        while(n>0)
        {
            n=n/10;

            countdi++;
        }
        System.out.println("nunber of digit" +num+ " =" +countdi);
    }
}
