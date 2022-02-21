package arrayList;

import java.util.*;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Angelina");
        names.add("Selena");
        names.add("Gulchatay");
        names.add(1,"George");

//        for(String i : names){
//            System.out.println(i);
//        }
//
//        for(int i = 0; i< names.size(); i++){
//            System.out.println(names.get(i));
//        }

        //   .iterator()
        Iterator itr = names.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        LinkedList<String> colors = new LinkedList<>();
        colors.add("Gray");
        colors.add("Pink");
        colors.add("Red");
        colors.add(1,"YELLOW");
        colors.addFirst("White");
        colors.addLast("Blue");
        System.out.println(colors);


        List<String> colors2 = new LinkedList<>();
        colors2.add("Black");
        colors2.addAll(colors);
        Collections.sort(colors2);
        System.out.println(colors2);




    }
}
