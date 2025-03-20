//search the given element x in array if the present in array the return array index

public class SearchGivenARR {
    public static void main(String[] args){
        search_val sc=new search_val();
        sc.demo();

    }
}
class search_val{
    void demo()
    {
         int[] arr={1,3,56,5,6,44,6,5};
         int x=5;
         for(int i=0;i<arr.length;i++)
         {
             if(arr[i]==x){
                 System.out.println(arr[i]);
                 System.out.println(i);
                 break;
             }

                // System.out.println("not availabel");


         }
        System.out.println("not available");

    }
}
