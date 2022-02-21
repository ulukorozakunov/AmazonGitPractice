
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PracticeLesson240122 {
    public static void main(String[] args) {
        System.out.println("Please enter your number");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        Integer[] mass = new Integer[num];

        List<Integer> list = new ArrayList(Arrays.asList(mass));
        for (int i = 0; i<list.size(); i++){
//            Integer numm = Math.random()%2;
            list.set(i,i*1);
        }
        System.out.println(list);
    }
}
