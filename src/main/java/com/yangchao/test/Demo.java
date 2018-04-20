package com.yangchao.test;

import java.util.function.Function;

public class Demo {


    public static void main(String[] args) {
        Function<String, String> addHeader = Letter::addHeader;
        Function<String, String> transformationPipeline
                = addHeader.andThen(Letter::checkSpelling)
                .andThen(Letter::addFooter);



        String hello = transformationPipeline.apply("hello");

        System.out.println(hello);
    }

}

class Car {

}

class Audi extends Car {

}

class Stop<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}



