package com.example.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("apple", "100");
        map.put("orange", "50");
        map.put("banana", "200");
        map.put("grape", "300");
        
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
    }
}
