package com.xmacedo.graphs;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Example1 {
    public static void main(String[] args) {
        Deque<String> doubleQueue = new LinkedList<>();
        
        Queue<String> queue = new LinkedList<>();

        queue.add("Alice");
        queue.add("Bob");
        queue.add("Claire");

        String personRemoved = queue.remove();

        if(checkIfYourSellerMango(personRemoved)){
            System.out.println(personRemoved+ " is");
        }
        System.out.println(personRemoved);

    }

    private static boolean checkIfYourSellerMango(String personRemoved) {
        if("M".equals(personRemoved.charAt(personRemoved.length()-1))){
            return true;
        }
        return false;
    }

}
