package set;

import java.util.*;

public class Sets  {
    public static void main(String[] args) {
        List<String> brands = new ArrayList<>();
        brands.add("BMW");
        brands.add("Tesla");
        brands.add("Mercedes");
        brands.add("Bugatti");
        brands.add("Tesla");
        brands.add("Ferrari");
        brands.add("Tesla");
        brands.add("Tesla");
        System.out.println("List : " + brands);

        Set<String> uniqueCars = new HashSet<>();  // Unpredictable order
        uniqueCars.addAll(brands);
        System.out.println("HashSet : " + uniqueCars);

        uniqueCars.add("Nissan");
        uniqueCars.add("Audi");
        uniqueCars.add("Bugatti");
        uniqueCars.add("Nissan");
        System.out.println("HashSet : " + uniqueCars);
//        System.out.println(uniqueCars.containsAll(brands));
//        System.out.println(uniqueCars.retainAll(brands));

        Set<String> linkedCars = new LinkedHashSet<>(brands); // Natural order
        System.out.println("LinkedHashSet : " +linkedCars);

        Set<String> treeCars = new TreeSet<>(brands); // Sorted order
        System.out.println("TreeSet : " + treeCars);
    }
}
