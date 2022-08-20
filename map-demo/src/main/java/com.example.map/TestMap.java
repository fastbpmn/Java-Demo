package com.example.map;

import io.swagger.annotations.ApiModel;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@ApiModel
public class TestMap {
    public static void main(String[] args) {
        // 创建一个 HashMap
        HashMap<String, String> countries = new HashMap<>();

        // 往HashMap插入映射项
        countries.put("A", "1");
        countries.put("B", "2");
        countries.put("C", "3");
        System.out.println("HashMap: " + countries);

        HashMap<String, String> test = new HashMap<>();
        test.put("A", "10");
        test.put("C", "30");

        //合并 key为 Washington的映射
        String returnedValue = countries.merge("A", "D", (oldValue, newValue) -> oldValue);
        System.out.println("Washington: " + returnedValue);

        //输出更新后的HashMap
        System.out.println("Updated HashMap: " + countries);

        Comparator<Integer> comparator = Integer::compare;
        int result = comparator.compare(100,1000);
        System.out.println("result = " + result);

        Stream<Double> integerStream = Stream.of(2.1, 2.2, -100.1, 5.2, 6.3, 3.1415926);
        Double max = integerStream.max(Double::compareTo).get();
        System.out.println("max = " + max);

        Stream<String> a = Stream.of("a", "b", "c");
        a.parallel().forEachOrdered(e->System.out.println(e.toUpperCase()));

        new Thread(() -> {
            System.out.print("Hello");
            System.out.println(" Hoolee");
        }).start();

    }
}
