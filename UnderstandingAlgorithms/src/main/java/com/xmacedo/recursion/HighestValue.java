package com.xmacedo.recursion;

import java.util.ArrayList;
import java.util.List;

public class HighestValue {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(List.of(5, 3, 6, 22, 15, 7, 10));
        System.out.println("The highest value on the list is: " + findValue(lst, 0));
    }

    private static int findValue(List<Integer> lst, int pos) {
        //base case if the index is the last in the list, returns the current one
        if (pos == lst.size() - 1) {
            return lst.get(pos);
        }
        //Recursive case, maximum value between the current and the next (maximum of the resulting elements);
        return Math.max(lst.get(pos), findValue(lst, pos + 1));
    }
}
