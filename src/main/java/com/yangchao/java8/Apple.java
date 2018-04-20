package com.yangchao.java8;

import com.yangchao.demo.App;

import java.util.ArrayList;
import java.util.List;

public class Apple {


    private List<Apple> inventory;

    private String color;
    private Integer weight;

    public String getColor() {
        return color;
    }

    public Integer getWeight() {
        return weight;
    }

    public static boolean isheavyApp(Apple apple) {
        return apple.getWeight().compareTo(150) > 0;
    }

    public static boolean isGreenApp(Apple apple) {
        return "green".equals(apple.getColor());
    }

    @FunctionalInterface
    public interface Predicate<T> {
        boolean test(T t);
    }

    public static List<Apple> filterApples(List<Apple> apples, Predicate<Apple> predicate) {

        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
