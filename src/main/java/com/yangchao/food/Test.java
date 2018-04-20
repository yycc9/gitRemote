package com.yangchao.food;

import org.apache.commons.lang3.time.DateUtils;

import java.io.IOException;
import java.text.ParseException;

public class Test {
    public static void main(String[] args) throws IOException, ParseException {
        String pattern = "yyyy-MM-dd HH:mm:ss";

        System.out.println(DateUtils.parseDate("2018-04-13 00:00:00", pattern).getTime() / 1000);
        System.out.println(DateUtils.parseDate("2018-04-19 23:59:59", pattern).getTime() / 1000);
    }

    public void test() {
    }

}
