package com.xmacedo.recursion;

public class Fatorial {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(fat(x));
    }

    private static int fat(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * fat(x - 1);
        }
    }
}
