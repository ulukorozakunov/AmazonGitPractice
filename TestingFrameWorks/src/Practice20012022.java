import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice20012022 {
    public static void main(String[] args) {
        Float [][] f1 = new Float[2][3];
        f1[0][0] = 10.1f;
        f1[0][1] = 10.2f;
        f1[0][2] = 10.3f;
        f1[1][0] = 10.4f;
        f1[1][1] = 10.5f;
        System.out.println(Arrays.deepToString(f1));

        System.out.println(convert(f1[1]));

    }
    public static List<Float> convert (Float f2 []){
        List<Float> f3 = Arrays.asList(f2);
        return f3;
    }
}
