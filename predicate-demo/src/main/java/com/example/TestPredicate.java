package com.example;

import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        Predicate<Integer> lessThan = i -> i < 18;
        System.out.println(lessThan.test(10));
        System.out.println(lessThan.test(20));
    }
}
