import java.util.Arrays;

public class ArrayPracticeWithLoop {
    public static void main (String []args){
        int [][] deep = {{1,5,6,8},{41,15,85},{101,999}};
        System.out.println(Arrays.deepToString(deep));


        int [] arr  = new int[3];
        arr [0] = 1;
        arr [1] = 2;
        arr [2] = 3;
        System.out.println(Arrays.toString(arr));


        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+ "  ");
        }
        System.out.println();
        for (int i : arr){
            System.out.print(i + " = ");
        }
        System.out.println();


        System.out.println(names());
        System.out.println(Example());
    }


    public static String names(){
        String [] name = new String[4];
        name [0] = "Zara";
        name [1] = "Tiago";
        name [2] = "Silvia";
        name [3] = "Andrew";

        for (String example : name)
            System.out.println(example);
        return ( " ");
    }


    public static String Example(){
        String [][] city ={{"Bishkek","Almaty"},{"New York","Boston","LA"},{"Moscow"}};
        for (int i=0; i<city.length; i++){
            for (int j=0;j<city[i].length; j++){
                System.out.print(city[i][j] + "   ");
            }
            System.out.println();
        }
        return " ";
    }

}

