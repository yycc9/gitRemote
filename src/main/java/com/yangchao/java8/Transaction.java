package com.yangchao.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.IntStream;

public class Transaction {

    private Currency currency;


    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }


    public static Map<Currency, List<Transaction>> groupTransaction(
            List<Transaction> transactions) {

        Map<Currency, List<Transaction>>
                map = new HashMap<>();

        for (Transaction transaction : transactions) {
            Currency currency = transaction.getCurrency();

            map.compute(currency, (k, ov) -> {
                if (ov == null) {
                    ov = new ArrayList<>();
                }
                ov.add(transaction);
                return ov;
            });
        }
        return null;
    }

    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        IntStream.rangeClosed(1, 1000_000_000).parallel()
                .forEach(e -> {int a = e + 1;});
        long t2 = System.currentTimeMillis();

        System.out.println("并行用时 -> " + (t2 - t1) + "ms");

        long t3 = System.currentTimeMillis();
        IntStream.rangeClosed(1, 1000_000_000)
                .forEach(e -> {int a = e + 1;});
        long t4 = System.currentTimeMillis();

        System.out.println("串行用时 -> " + (t4 - t3) + "ms");


    }
}
