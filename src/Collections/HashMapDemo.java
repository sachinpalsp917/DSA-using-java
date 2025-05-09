package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map  = new HashMap<>();
        map.put(1,"Sachin");
        map.put(2,"Dhruv");
        map.put(3,"Renu");

        System.out.println(map);
        String s = map.get(3);
        System.out.println(s);
        String s1 = map.get(78);
        System.out.println(s1);

        System.out.println(map.containsKey(23));
        System.out.println(map.containsValue("Renu"));

        for (int i:map.keySet()){
            System.out.print(map.get(i));
        }
        System.out.println();
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (Map.Entry<Integer, String> i:entries){
            System.out.println(i.getKey()+": "+i.getValue());
        }

        //to make the values uppercase
        for (Map.Entry<Integer, String> i:entries){
            i.setValue(i.getValue().toUpperCase());
        }
        System.out.println(entries);

//        map.remove(3);

        boolean b = map.remove(3, "Renu");
        System.out.println(b);

        System.out.println(map);


    }
}
