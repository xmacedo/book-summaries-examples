package com.xmacedo.ordination;

import java.util.ArrayList;
import java.util.List;

//Chapter 2
public class SortBySelection {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(5, 3, 6, 2, 10));
        System.out.println(sortBySelection(arr));
    }

    private static List<Integer> sortBySelection(List<Integer> arr) {
        List<Integer> newArr = new ArrayList<>();
        while (!arr.isEmpty()) {
            int small = searchSmallIndex(arr);
            newArr.add(arr.remove(small));
        }
        return newArr;
    }

    private static int searchSmallIndex(List<Integer> arr) {
        int small = arr.get(0);
        int smallIndex = 0;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < small) {
                small = arr.get(i);
                smallIndex = i;
            }
        }
        return smallIndex;
    }
}
