import java.util.ArrayList;
import java.util.Arrays;

public class LessonArrayList {
    public static void main(String[] args) {
        int [] arr = {35, 98, 0, 3};
        int [] arr2= new int [5];

        System.out.println();

        // Non-generic
        ArrayList list = new ArrayList();

        // Generic
        ArrayList<String> arrlist = new ArrayList<>();
        ArrayList<String> arrlist1 = new ArrayList<String>();

        ArrayList<String> names = new ArrayList<>();
        names.add("Angelina");
        names.add("Fedor");
        names.add("Nikita");
        System.out.println(names);
        names.add (2,"Alena");
        System.out.println(names);

        ArrayList<String> name2 = new ArrayList<>();
        name2.add("Christian");
        name2.addAll(0,names);
        System.out.println(name2);

        name2.remove("Fedor");
        System.out.println(name2);
//        name2.removeAll(names);
//        System.out.println(name2);
//
//        name2.clear();
//        System.out.println(name2);
//        System.out.println(!(name2.isEmpty()));

        System.out.println(name2.get(2));
    }
}
