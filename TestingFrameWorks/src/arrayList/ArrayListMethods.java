package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args) {
        int [] arr = {35, 98, 0, 3};
        int [] arr2 = new int [5];
        arr2[0] = 9;
        System.out.println(arr2[0]);

        // Non-Generic
        ArrayList list = new ArrayList();

        //Generic
        ArrayList<String> arrlist = new ArrayList<>();
        ArrayList<String> arrlist2 = new ArrayList<String>();

        ArrayList<String> names = new ArrayList<>();
        names.add("Angelina");
        names.add("Selena");
        names.add("Gulchatay");
        System.out.println(names);
        names.add(2,"Justin");
        System.out.println(names);

        ArrayList<String> name2 = new ArrayList<>();
        name2.add("Christian");
        name2.addAll(names);
        System.out.println(name2);      //[Christian, Angelina, Selena, Justin, Gulchatay]

        name2.remove("Justin");
        System.out.println(name2);      //[Christian, Angelina, Selena, Gulchatay]
//        name2.removeAll(names);
//        System.out.println(name2);      //[Christian]
//
//        name2.clear();
//        System.out.println(name2);      //[]
//
//        System.out.println(name2.isEmpty());  //true
//        System.out.println(!(name2.isEmpty())); //false

        System.out.println(name2.get(2));
        System.out.println(name2);   //[Christian, Angelina, Selena, Gulchatay]

        System.out.println(name2.set(3,"Dior"));
        System.out.println(name2);
        System.out.println(name2.size());
        System.out.println(name2.contains("Selena"));
        System.out.println(name2.contains("Gulchatay"));
        System.out.println(name2.contains(names));
        System.out.println(name2.equals(names));

        Collections.sort(name2);
        System.out.println(name2);

    }
}
