package com.xmacedo.hash;

import java.util.HashMap;

//Chapter 5
public class HashTable {
    public static void main(String[] args) {
        HashMap<String, Integer> listaTelefonica = new HashMap<>();

        listaTelefonica.put("jenny", 8675309);
        listaTelefonica.put("emergency", 911);

        System.out.println(listaTelefonica.get("jenny"));
    }
}
