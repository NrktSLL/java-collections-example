package com.javacollections.ArrayList;

import com.javacollections.Models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListsExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("EMRE");
        list.add("HASAN");
        list.add("ALI");
        list.add("AYSE");

        //Iterator örneği
        ListIterator iterator = list.listIterator();

        System.out.println("Baştan sona");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\nSondan başa");

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(11);
        values.add(10);
        values.add(5);

        System.out.println("\nValues: " + values);

        List<Product> products=new ArrayList<>();
        products.add(new Product("test", 1, true));
        products.add(new Product("test3", 3, false));
        products.add(new Product("test", 2, false));
        products.add(new Product("test4", 4, true));


        List<Product> products2=new ArrayList<>();
        products2.add(new Product("test", 1, true));
        products2.add(new Product("test3", 3, false));
        products2.add(new Product("test", 2, false));
        products2.add(new Product("test4", 4, true));


        System.out.println("\nProducts: " + products);

        System.out.println("\nProducts: " + products2);
        System.out.println("Product same product2 " + products2.equals(products));

    }

}
