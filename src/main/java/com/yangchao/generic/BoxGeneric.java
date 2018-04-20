package com.yangchao.generic;

public class BoxGeneric<T> {
    private T t; // T stands for type

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public static void main(String[] args) {
        BoxGeneric<Number> boxNum = new BoxGeneric<>();

        boxNum.setT(1);

        // boxTest(new BoxGeneric<Integer>())

    }

    public static void boxTest(BoxGeneric<Number> n) {

    }

}
