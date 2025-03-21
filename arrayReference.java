public class arrayReference {
    public static void main(String[] args){
        int[] arr=new int[3];
        arr[0]=10;
        arr[1]=30;
        arr[2]=40;
        passval(arr);// original array
        int[] arr2=arr;
        passval(arr2); //duplicate array
    }
     static void passval(int[] as)
     {
         for(int i=0;i<as.length;i++){
             System.out.println(as[i]);
         }
         System.out.println(" ");
     }
}
