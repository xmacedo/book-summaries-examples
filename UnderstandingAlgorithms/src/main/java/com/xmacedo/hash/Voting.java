package com.xmacedo.hash;

import java.util.HashMap;

//Capitulo 5 pag 101
public class Voting {

    private static HashMap<String, Boolean> listOfVoted = new HashMap<>();

    public static void main(String[] args) {
        checkVoter("tom");
        checkVoter("mike");
        checkVoter("mike");
    }

    private static void checkVoter(String name) {
        if (!listOfVoted.isEmpty() && listOfVoted.get(name) != null) {
            System.out.println("Send away!");
        } else {
            listOfVoted.put(name, true);
            System.out.println("Let vote!");
        }
    }
}
