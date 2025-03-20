public class Array2 {
    public static void main(String[] args){
        String [][] arr={{"nitu","rishu"},{"anjali","bhanu"}};
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println(arr[i][j]);
            }
        }

        System.out.println(arr[0][0]);
         System.out.println(arr[0][1]);
         System.out.println(arr[1][0]);
         System.out.println(arr[1][1]);
        System.out.println(arr.length);
        }
    }
