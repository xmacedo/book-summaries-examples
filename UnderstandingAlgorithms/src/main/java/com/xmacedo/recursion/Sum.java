package com.xmacedo.recursion;

import java.util.ArrayList;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(List.of(5, 3, 6, 2, 10));
        System.out.println("Sum of the list is: "+ count(lst, 0));
    }

    private static int count(List<Integer> lst, int pos) {
        if(pos == lst.size()){
            return 0;
        }
        return lst.get(pos) + count(lst, pos +1);
    }
}
