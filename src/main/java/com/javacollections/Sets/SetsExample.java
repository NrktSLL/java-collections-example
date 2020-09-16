package com.javacollections.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsExample {

    public static void main(String[] args) {
        Set<String> hashSetSet = new HashSet<>();
        hashSetSet.add("Osman");
        hashSetSet.add("Nurkut");
        hashSetSet.add("Ayse");
        hashSetSet.add("Osman");
        for (String str : hashSetSet) {
            System.out.println("HashSet: " + str);
        }

        System.out.println("\n");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Osman");
        linkedHashSet.add("Nurkut");
        linkedHashSet.add("Ayse");
        linkedHashSet.add("Osman");
        for (String str : linkedHashSet) {
            System.out.println("LinkedHashSet: " + str);
        }

        System.out.println("\n");

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Osman");
        treeSet.add("Nurkut");
        treeSet.add("Ayse");
        treeSet.add("Osman");
        for (String str : treeSet) {
            System.out.println("TreeSet: " + str);
        }

    }
}
