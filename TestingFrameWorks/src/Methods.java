import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        int arr[][] = new int[3][2];
        arr[0][0] = 10;
        arr[1][0] = 20;
        arr[0][1] = 40;
        arr[1][1] = 60;
        arr[2][0] = 80;
        arr[2][1] = 100;
        System.out.println(Arrays.deepToString(arr));


        Methods object = new Methods();
        System.out.println(object.names());


    }

    //   { [[James, John], [Clark, Camil]]
    public static String names() {
        String name[][] = new String[2][2];
        name[0][0] = "James";
        name[1][0] = "John";
        name[0][1] = "Clark";
        name[1][1] = "Camil";
        return names();
    }
}

