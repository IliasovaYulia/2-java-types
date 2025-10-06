package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String text = Integer.toString(value);
        return Integer.parseInt(new StringBuilder(text).reverse().toString());
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);

    }


}
