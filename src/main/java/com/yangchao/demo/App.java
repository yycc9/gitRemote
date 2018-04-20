package com.yangchao.demo;

import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.util.Date;

public class App {
    public static void main(String[] args) throws ParseException {

        Date start = DateUtils.parseDate("2018-03-30 00:00:00", "yyyy-MM-dd HH:mm:ss");
        Date end = DateUtils.parseDate("2018-04-06 23:59:59", "yyyy-MM-dd HH:mm:ss");

        System.out.println(start.getTime() / 1000);
        System.out.println(end.getTime() / 1000);

    }
}
