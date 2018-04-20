package com.yangchao.generic;

import java.util.Currency;
import java.util.List;
import java.util.function.Supplier;

public class Node<T extends Fruit> {
    private T data;
    private Node<T> next;
    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
    public T getData() { return data; }

    private static String str = "xxx";
    public static void main(String[] args) throws NoSuchFieldException, InterruptedException {
        Cherry cherry = new Cherry();
        cherry.setWight(10);


        Supplier<Integer> supplier = cherry::getWight;

        cherry.setWight(20);

        System.out.println(supplier.get());


    }


    static class Cherry {
        private Integer wight;

        public Integer getWight() {
            return wight;
        }

        public void setWight(Integer wight) {
            this.wight = wight;
        }
    }



}
