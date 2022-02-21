package map;

import java.util.*;

public class Map1 {
    public static void main(String[] args) {

        Map<String, String> fullNames = new HashMap<>();
        //             key          value
        //             klyuch       znachenie
        fullNames.put("Atabekov", "Mirbek");
        fullNames.put("Satylganova", "Gulnur");
        fullNames.put("Beishekeev", "Syimyk");
        fullNames.put("Borbiev", "Bek");
        fullNames.put("Moldokmatova", "Assol");
        System.out.println(fullNames.get("Moldokmatova"));

        for(String i : fullNames.keySet()){
            System.out.println(i);
        }
        for (String j : fullNames.values()){
            System.out.println(j);
        }
        for (Map.Entry<String, String> keyAndValue : fullNames.entrySet()){
            System.out.println("Keys : " + keyAndValue.getKey() + "\n" +
                                "Value : " + keyAndValue.getValue());
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        for (String i : fullNames.keySet()){
            System.out.println("Key: "+ i + "\n" + "Value: " + fullNames.get(i));
        }
        System.out.println(fullNames);

        Map<String, String> linkedFullNames = new LinkedHashMap<>(fullNames);
        System.out.println(linkedFullNames);

        Map<String, String> treeFullNames = new TreeMap<>(linkedFullNames);
        System.out.println(treeFullNames);

        List<String> list = new ArrayList<>();
        list.add("Tamga");           // index 0 --> value "Tamga"
        list.add("Begish");
        list.add("Bakr");
        list.add("UlukManapo");
        list.add("Bayastan");
        System.out.println(list.get(3));

    }
}
