package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) {

        int a = (int)c - 32;
        c = (char)a;
        return c;
    }

    public static void main(String[] args) {

        char result = toUpperCase('x');
        System.out.println(result);
    }

}
