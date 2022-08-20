package com.example.string;

import java.util.Arrays;

public class TestString {
    public static void main(String[] args) {
        String test = "hello world.";
        String[] test1 = test.split("\\s");
        System.out.println("test1 = " + Arrays.deepToString(test1));
    }
}
