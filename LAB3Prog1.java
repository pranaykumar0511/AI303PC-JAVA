
public class LAB3Prog1 {

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;
        for (int p : arr) {
            System.out.print("[" + p + "," +"]");
        }
    }
  public int[] twoSum(int[] nums, int target) {
      
        int rarr[]=new int[2];
        for(int i = 0;i<nums.length-1;i++)
         if (target== nums[i]+nums[i+1]){
            rarr[0]=i;
            rarr[1]=i+1;
            return rarr;
 

         }
         return null;
    }
}
}
