package com.example;

import java.util.function.Function;

public class TestFunction {

    public static int testFunctionApply(int i, Function<Integer, Integer> func) {
        return func.apply(i);
    }

    public static int testFunctionCompose(int i, Function<Integer, Integer> func1, Function<Integer, Integer> func2) {
        return func1.compose(func2).apply(i);
    }

    public static int testFunctionAndThen(int i, Function<Integer, Integer> func1, Function<Integer, Integer> func2) {
        return func1.andThen(func2).apply(i);
    }

    public static void main(String[] args) {
        System.out.println("testFunctionApply = " + testFunctionApply(2, i -> i * 2 + 1));
        System.out.println("testFunctionCompose = " + testFunctionCompose(2, i -> i * 2 + 1, i -> i * 2));
        System.out.println("testFunctionAndThen = " + testFunctionAndThen(2, i -> i * 2 + 1, j -> j * 2));
    }
}
