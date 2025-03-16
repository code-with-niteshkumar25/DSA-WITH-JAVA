
 // Factorial

import java.util.Scanner;
public class Fact {
  public static void main(String[] args) {
      int n;
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      int ans = 1;
      while (n>=1){

          ans = ans*n ;
       n--;
          // System.out.println(ans);
      }
    //  System.out.println(ans);
  }


}
