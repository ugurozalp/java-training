package com.ugurozalp.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapApps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("Ugur", 28);
        map.put("Deniz", 30);
        map.put("Esra", 24);

        // --------------------------------------------
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(map.get(key));
        }

        // --------------------------------------------
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println(value);
        }

        // --------------------------------------------
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " - " + value);
        }

        // --------------------------------------------
        int size = map.size();
        System.out.println("size: " + size);
        // --------------------------------------------
        map.isEmpty();
        // --------------------------------------------

        // --------------------------------------------
        if (map.containsKey("Ugur")) {
            System.out.println("Ugur - " + map.get("Ugur"));
        }
        // --------------------------------------------
        if (map.containsValue(30)) {
            System.out.println("Deniz - " + map.get("Deniz"));
        }
        // --------------------------------------------
        map.remove("Deniz");
        // --------------------------------------------
        map.clear();
    }
}
