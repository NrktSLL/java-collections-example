package com.javacollections.Maps;

import java.util.*;

public class MapsExample {

    public static void main(String[] args) {

        Map<String, String> userHashMap = new HashMap<>();
        userHashMap.put("email", "nurkut@example.com");
        userHashMap.put("name", "Ali Nurkut");
        userHashMap.put("address", "İstanbul 34000");
        userHashMap.put("mobile", "5322100000");

        for (Map.Entry<String, String> values : userHashMap.entrySet()) {
            System.out.println("HashMap: " + values);
        }

        System.out.println("\n");

        Map<String, String> userLinkedHashMap = new LinkedHashMap<>();
        userLinkedHashMap.put("email", "nurkut@example.com");
        userLinkedHashMap.put("name", "Ali Nurkut");
        userLinkedHashMap.put("address", "İstanbul 34000");
        userLinkedHashMap.put("mobile", "5322100000");

        for (Map.Entry<String, String> values : userLinkedHashMap.entrySet()) {
            System.out.println("LinkedHashMap: " + values);
        }

        System.out.println("\n");

        Map<String, String> userTreeMap = new TreeMap<>();
        userTreeMap.put("email", "nurkut@example.com");
        userTreeMap.put("name", "Ali Nurkut");
        userTreeMap.put("address", "İstanbul 34000");
        userTreeMap.put("mobile", "5322100000");

        for (Map.Entry<String, String> values : userTreeMap.entrySet()) {
            System.out.println("TreeMap: " + values);
        }

        System.out.println("\n");

        Map<String,String> userHashTable = new Hashtable<>();
        userHashTable.put("email", "nurkut@example.com");
        userHashTable.put("name", "Ali Nurkut");
        userHashTable.put("address", "İstanbul 34000");
        userHashTable.put("mobile", "5322100000");

        for (Map.Entry<String, String> values : userHashTable.entrySet()) {
            System.out.println("HasTable: " + values.getKey() + " " + values.getValue());
        }
    }
}
