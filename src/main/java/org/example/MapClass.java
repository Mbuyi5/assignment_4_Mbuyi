package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
    static Map<String, String> map = new HashMap<>();

    public static void loadEmployees(){
        map.put("Aris","Developer");
        map.put("Trevor","Manager");
    }

    public static Map<String, String> getMap(){
        return map;
    }
}
