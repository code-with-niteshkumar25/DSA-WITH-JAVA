//import java.util.Arrays;

public class Arrayoddeven {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,66,77,22,22,31,24,55,11};
        int a=0;
        int b=0;
        for(int i=0;i<13;i++){
            if(arr[i]%2==0)
            {
                a+=arr[i];
            }
            else{
                b+=arr[i];
            }

        }
        System.out.println(a);
        System.out.println(b);
    }
}
