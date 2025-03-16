

 import java.util.Scanner;
class abc {
    int add(int x, int y) {
        int ans = x + y;
        return ans;

    }
}
        public class Method{

        public static void main(String[] args)
        {
            abc sc=new abc();
            Scanner s =new Scanner(System.in);
            System.out.println("enter the number");
            int a = s.nextInt();
            int b=s.nextInt();
            int ans;
             ans=sc.add(a, b);
            System.out.println(ans);

        }
    }

