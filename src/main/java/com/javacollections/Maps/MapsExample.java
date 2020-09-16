package com.javacollections.Maps;

import com.javacollections.Models.Product;

import java.util.*;

public class MapsExample {

    public static void main(String[] args) {

        Product test1 = new Product("test1", 1, true);
        Product test2 = new Product("test1", 4, false);
        Product test3 = new Product("test1", 5, false);
        Product test4 = new Product("test1", 2, true);
        Product test5 = new Product("test1", 2, true);


        List<Product> list = new LinkedList<>();
        Collections.addAll(list, test1, test2, test3, test4, test5);

        //<editor-fold desc="HashMap">
        Map<String, String> userHashMap = new HashMap<>();
        userHashMap.put("email", "nurkut@example.com");
        userHashMap.put("name", "Ali Nurkut");
        userHashMap.put("address", "İstanbul 34000");
        userHashMap.put("mobile", "5322100000");

        for (Map.Entry<String, String> values : userHashMap.entrySet()) {
            System.out.println("HashMap: " + values);
        }

        System.out.println("\n");

        Map<Integer, Product> modelHashMap = new HashMap<>();

        for (Product product : list) {
            modelHashMap.put(product.getId(), product);
        }

        for (Map.Entry<Integer, Product> values : modelHashMap.entrySet()) {
            System.out.println("HashMapModel: " + values.getKey() + " " + values.getValue());
        }

        System.out.println("\n");
        //</editor-fold>

        //<editor-fold desc="LinkedHashMap">
        Map<String, String> userLinkedHashMap = new LinkedHashMap<>();
        userLinkedHashMap.put("email", "nurkut@example.com");
        userLinkedHashMap.put("name", "Ali Nurkut");
        userLinkedHashMap.put("address", "İstanbul 34000");
        userLinkedHashMap.put("mobile", "5322100000");

        for (Map.Entry<String, String> values : userLinkedHashMap.entrySet()) {
            System.out.println("LinkedHashMap: " + values);
        }

        System.out.println("\n");

        Map<Integer, Product> ModelLinkedHashMap = new LinkedHashMap<>();

        for (Product product : list) {
            ModelLinkedHashMap.put(product.getId(), product);
        }

        for (Map.Entry<Integer, Product> values : ModelLinkedHashMap.entrySet()) {
            System.out.println("LinkedHashMapModel: " + values.getKey() + " " + values.getValue());
        }

        System.out.println("\n");
        //</editor-fold>

        //<editor-fold desc="TreeMap">
        Map<String, String> userTreeMap = new TreeMap<>();
        userTreeMap.put("email", "nurkut@example.com");
        userTreeMap.put("name", "Ali Nurkut");
        userTreeMap.put("address", "İstanbul 34000");
        userTreeMap.put("mobile", "5322100000");

        for (Map.Entry<String, String> values : userTreeMap.entrySet()) {
            System.out.println("TreeMap: " + values);
        }

        System.out.println("\n");

        Map<Integer, Product> modelTreeMap = new TreeMap<>(Integer::compareTo);

        for (Product product : list) {
            modelTreeMap.put(product.getId(), product);
        }

        for (Map.Entry<Integer, Product> values : modelTreeMap.entrySet()) {
            System.out.println("TreeMapModel: " + values.getKey() + " " + values.getValue());
        }

        System.out.println("\n");
        //</editor-fold>

        //<editor-fold desc="Hashtable">
        Map<String, String> userHashTable = new Hashtable<>();
        userHashTable.put("email", "nurkut@example.com");
        userHashTable.put("name", "Ali Nurkut");
        userHashTable.put("address", "İstanbul 34000");
        userHashTable.put("mobile", "5322100000");

        for (Map.Entry<String, String> values : userHashTable.entrySet()) {
            System.out.println("HasTable: " + values.getKey() + " " + values.getValue());
        }

        System.out.println("\n");

        Map<Integer, Product> modelHashTable = new Hashtable<>();

        for (Product product : list) {
            modelHashTable.put(product.getId(), product);
        }

        for (Map.Entry<Integer, Product> values : modelHashTable.entrySet()) {
            System.out.println("HashTableModel: " + values.getKey() + " " + values.getValue());
        }

        System.out.println("\n");
        //</editor-fold>

    }
}
