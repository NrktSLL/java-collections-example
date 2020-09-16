package com.javacollections.Sets;

import com.javacollections.Models.Product;

import java.util.*;

public class SetsExample {

    public static void main(String[] args) {

        Product test1 = new Product("test1", 1, true);
        Product test2 = new Product("test1", 4, false);
        Product test3 = new Product("test1", 5, false);
        Product test4 = new Product("test1", 2, true);
        Product test5 = new Product("test1", 2, true);

        List<Product> list = new LinkedList<>();
        Collections.addAll(list, test1, test2, test3, test4, test5);

        //<editor-fold desc="HashSet">
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Osman");
        hashSet.add("Nurkut");
        hashSet.add("Ayse");
        hashSet.add("Osman");
        for (String str : hashSet) {
            System.out.println("HashSet: " + str);
        }

        System.out.println("\n");

        //HashSetModel
        Set<Product> hashSetModel = new HashSet<>(list);

        for (Product str : hashSetModel) {
            System.out.println("HashSetModel: " + str);
        }

        System.out.println("\n");
        //</editor-fold>

        //<editor-fold desc="LinkedHashSet">
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Osman");
        linkedHashSet.add("Nurkut");
        linkedHashSet.add("Ayse");
        linkedHashSet.add("Osman");

        for (String str : linkedHashSet) {
            System.out.println("LinkedHashSet: " + str);
        }

        System.out.println("\n");

        //LinkedHashSetModel
        Set<Product> modelLinkedHashSet = new LinkedHashSet<>(list);

        for (Product str : modelLinkedHashSet) {
            System.out.println("linkedHashSetModel: " + str);
        }

        System.out.println("\n");
        //</editor-fold>

        //<editor-fold desc="TreeSet">
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Osman");
        treeSet.add("Nurkut");
        treeSet.add("Ayse");
        treeSet.add("Osman");

        for (String str : treeSet) {
            System.out.println("TreeSet: " + str);
        }

        System.out.println("\n");

        //TreeSetModel
        Set<Product> modelTreeSet = new TreeSet<>(Comparator.comparingInt(Product::getId));
        modelTreeSet.addAll(list);
        for (Product str : modelTreeSet) {
            System.out.println("treeSetModel: " + str);
        }

        //</editor-fold>
    }
}
