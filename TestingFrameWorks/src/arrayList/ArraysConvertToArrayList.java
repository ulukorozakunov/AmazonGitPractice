package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysConvertToArrayList {
    public static void main(String[] args) {
        String[] symbols = {"D","i","g","i","t","a","l"};

        //  ArrayList<String> al3 = List<String>();     Wrong/Error
        ArrayList<String> al = new ArrayList<>();
        System.out.println(al);

        //First way  --->  Arrays.asList();
        List<String> al1 = Arrays.asList(symbols);
        System.out.println(al1);
        System.out.println(al1.size());

        //Second way ----> Collections.addAll();
        List<String> al2 = new ArrayList<>();
        Collections.addAll(al2,symbols);
        System.out.println(al2);
        System.out.println(al2.size());

        //Third way ---> for(String i : arrays){ }
        List<String> al3 = new ArrayList<>();
        for (String digital : symbols){
            al3.add(digital);
        }
        System.out.println(al3);
        System.out.println(al3.size());

//        Arrays --> immutable -- >fixed size
//        ArrayList --> mutable --> editable


    }
}
