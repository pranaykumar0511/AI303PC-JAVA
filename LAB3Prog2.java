public class LAB3Prog2 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 3, 5, 7, 9};

        int size = 3; 
        int[][] result = new int[arr.length][size];
        int flag =0;
        for (int i = 0; i < arr.length; i += size) {
            for (int j = 0; j < size; j++) {
                result[flag][j] = arr[i + j];
                
            }
            flag++;
            for(int[] x: result){
                for(int y : x){
                    System.out.print(y+"");
                }
                System.out.println("");
            }
        }
    }
}
