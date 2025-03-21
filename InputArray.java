import java.util.Scanner;
public class InputArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int[] arr=new int[n];


        System.out.println("enter array element");
        for(int  i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i : arr) {
            System.out.println(i);

        }

       // System.out.println(ans);
    }
}
