import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
    Practice object = new Practice();
    object.shot();
    }

    public String shot() {
        Scanner scn = new Scanner(System.in);
        int scn1 = scn.nextInt();
        for (int i = 1; i <= scn1; i++) {
            System.out.println("SHOT");
        }
        return "shots";
    }
}
