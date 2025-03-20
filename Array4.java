public class Array4 {
    public static void main(String[] args){
        int j=0;

        int[] arr={2,3,4};

        for(int i=0; i<3;i++)
        {
            System.out.println(arr[i]);
        }

       for(int a : arr)
        {
            System.out.println(a);
        }
       while(j<3)
       {
           System.out.println(arr[j]);
           j++;
       }

      /* do{
           int k=0;
           System.out.println(arr[k]);
           k++;
           while (k<3);
       } */

}}
