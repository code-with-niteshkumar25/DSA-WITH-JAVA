public class Arrays {
    public static  void main(String[] args){
        ArrayExample sc =new ArrayExample();
         sc.arraydemo();

    }
}
 class ArrayExample{
    void arraydemo(){
        int[] arr= new int[5];
        arr[0]=12;
        arr[1]=13;
        arr[2]=14;
        arr[3]=30;

        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);


    }
 }
