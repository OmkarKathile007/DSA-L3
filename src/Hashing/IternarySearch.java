package Hashing;

import java.io.FilterOutputStream;
import java.util.HashMap;
import java.util.HashSet;

public class IternarySearch {

    public static String Journey(HashMap<String,String> ticket){
        HashMap<String,String> route=new HashMap<>();
        for (String key: ticket.keySet()) {
            route.put(ticket.get(key),key);
        }

        for (String key: ticket.keySet()) {
            if (!route.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> ticket = new HashMap<>();
        ticket.put("Chennai","Bengaluru");
        ticket.put("Mumbai","Goa");
        ticket.put("Goa","Chennai");
        ticket.put("Delhi","Goa");
        System.out.println(ticket);

        String start =Journey(ticket);
        System.out.println(start);
        for (String key: ticket.keySet()){
            start = ticket.get(key);
            System.out.println(start);

        }

    }
}
