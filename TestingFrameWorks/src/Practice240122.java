import java.util.Scanner;

public class Practice240122 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scn.nextInt();

        if (age >10){
            System.out.println(age/2);
        }else {
            System.out.println("Please re-enter your age"+scn);
        }
    }
}
