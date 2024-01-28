package Hashing;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapAndTreeMap {

    public static void main(String[] args) {
        // Insertion order is Maintained
        LinkedHashMap<String ,Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",120);
        lhm.put("China",150);
        lhm.put("USA",60);
        lhm.put("SriLanka",40);
        lhm.put("Nepal",20);
        System.out.println(lhm);


        // TreeMap store the key in Sorted Manner
        TreeMap<String ,Integer> tm = new TreeMap<>();
        tm.put("India",120);
        tm.put("China",150);
        tm.put("USA",60);
        tm.put("SriLanka",40);
        tm.put("Nepal",20);
        System.out.println(tm);


    }
}
