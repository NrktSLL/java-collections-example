package com.javacollections.ArrayList;

import java.util.LinkedList;

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

    }
}
