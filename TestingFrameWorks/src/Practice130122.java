import java.util.Arrays;

public class Practice130122 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(len(7,5)));
        int nums [] = {1,2,3,4,5};
        System.out.println((sum(nums)));
    }
    public static int[] len(int a , int leng){
        int result [] = new int [leng];
        for ( int i = 0 ; i < leng ; i++){
            result[i] = a*(i+1);
        }
        return result;
    }

    public static int  sum( int[]nums){


        int temp =0;
        for (int i = 0; i<nums.length ; i++){
           temp = temp + nums[i];
        }
            return temp;
    }
}
