public class digireturn {
    public static void main(String[] args)
    {
        int arr =2345;
       // int i=5;
        int ans=0;
        //for(i=0;i<5;i++){

            while(arr>0)
            {
                ans=ans*10 + arr%10;
                arr/=10;
              //  i--;
              //  System.out.println(ans);
    } System.out.println(ans);
    }
}
