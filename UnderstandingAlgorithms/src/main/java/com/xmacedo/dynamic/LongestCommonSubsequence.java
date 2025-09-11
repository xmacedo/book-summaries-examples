package com.xmacedo.dynamic;

import java.util.Arrays;

public class LongestCommonSubsequence {
    //table
    //Hish X Fish
    //--
    //     F  O  S  H
    // F - 1  0  0  0
    // O - 0  2  0  0
    // R - 0  0  0  0
    // T - 1  0  0  0
    public static void main(String[] args) {
        getCommonSubsequence("FOSH", "FORT");
        getCommonSubsequence("FOSH", "FISH");
    }

    private static void getCommonSubsequence(String a, String b) {
        String[] word_a = a.split("");
        String[] word_b = b.split("");

        int[][] cell = new int[word_a.length][word_b.length];

        for (int i = 0; i < word_a.length; i++) {
            for (int j = 0; j < word_b.length; j++) {

                int temp_i = i == 0 ? 0 : i - 1;
                int temp_j = j == 0 ? 0 : j - 1;

                if (word_a[i].equals(word_b[j])) {
                    cell[i][j] = cell[temp_i][temp_j] + 1;
                } else {
                    cell[i][j] = Math.max(cell[temp_i][j], cell[i][temp_j]);
                }
            }
        }
        System.out.println(Arrays.deepToString(cell));
    }
}
