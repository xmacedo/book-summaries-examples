package com.xmacedo.dynamic;

import java.util.Arrays;
import java.util.List;

public class LongestCommonSubstring {
    //table
    //Hish X Fish
    //--
    //     H  I  S  H
    // F - 0  0  0  0
    // I - 0  1  0  0
    // S - 0  0  2  0
    // H - 1  0  0  3
    public static void main(String[] args) {
        List<String> word_a = Arrays.asList("H", "I", "S", "H");
        List<String> word_b = Arrays.asList("F", "I", "S", "H");

        int[][] cell = new int[word_a.size()][word_b.size()];

        for (int i = 0; i < word_a.size(); i++) {
            for (int j = 0; j < word_b.size(); j++) {
                if (word_a.get(i).equals(word_b.get(j))) {
                    int temp_i = i == 0 ? 0 : i - 1;
                    int temp_j = j == 0 ? 0 : j - 1;

                    cell[i][j] = cell[temp_i][temp_j] + 1;
                } else {
                    cell[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(cell));
    }
}
