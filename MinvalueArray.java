public class MinvalueArray {
    public static void main(String[] args){
        int ans=0;
        int[][] arr={{35,73,220},{30,220,10},{300,46,55}};
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
                if(arr[i][j]>ans)
                {
                    ans=arr[i][j];
                }
            }
        }
        System.out.println(ans);
    }
}
