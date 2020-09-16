package com.javacollections.ArrayList;

import com.javacollections.Models.Product;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        System.out.println("\n");


        LinkedList<Integer> values = new LinkedList<>();
        values.add(1);
        values.add(11);
        values.add(10);
        values.add(5);
        System.out.println(values);
        System.out.println("Stackden getirilen eleman: " + values.pop());

        System.out.println("\n");

        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        System.out.println("Stackden getirilen eleman: " + stack.pop());
        System.out.println("Stackden getirilen eleman: " + stack.pop());


        List<Product> products=new LinkedList<>();
        products.add(new Product("test", 1, true));
        products.add(new Product("test3", 3, false));
        products.add(new Product("test", 2, false));
        products.add(new Product("test4", 4, true));


        List<Product> products2=new LinkedList<>();
        products2.add(new Product("test", 1, true));
        products2.add(new Product("test3", 3, false));
        products2.add(new Product("test", 2, false));
        products2.add(new Product("test4", 4, true));


        System.out.println("\nProducts: " + products);

        System.out.println("\nProducts: " + products2);
        System.out.println("Product same product2 " + products2.equals(products));

    }
}
