import java.util.Scanner;
public class Methodpassref {
public static void main(String[] args)
    {
        addnum scc=new addnum();
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        scc.add(a,b);
    }
}
class addnum{
    void add(int x, int y)
    {
        System.out.println(x+y);
    }

}