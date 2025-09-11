package com.xmacedo.recursion;

import java.util.ArrayList;
import java.util.List;

public class Count {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(List.of(5, 3, 6, 2, 10));
        System.out.println("The quantity of items is: "+ counting(lst, 0));
    }

    private static int counting(List<Integer> lst, int pos) {
        if(pos == lst.size()){
            return 0;
        }
        return 1 + counting(lst, pos +1);
    }
}
