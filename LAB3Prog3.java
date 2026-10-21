import java.util.Arrays;
public class LAB3Prog3{
    public static void main (String[] args){
        int[][] arr ={{1,2}, {3,4}};
        int[][] arr1 ={{1,2} ,{3,4}};
        System.out.println(Arrays.deepEquals(arr,arr1));
        System.out.println(arr == arr1);
    }
}
