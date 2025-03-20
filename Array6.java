public class Array6 {
    public static void main(String[] args){
        int[][] arr={
                {23,4,5},{1,4,7},{34,5,70},{2,4,5}
        };
        for (int[] ints : arr) {
            for (int j = 0; j < arr[j].length; j++) {
                System.out.println(ints[j]);
            }
        }
    }
}
