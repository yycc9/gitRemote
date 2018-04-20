package com.yangchao.generic;

import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;

public class Box {

    /**
     * box中仅仅封装String类型
     */

    private String object;

    public void setObject(String object) {
        this.object = object;
    }

    public String getObject() {
        return object;
    }

    public static void main(String[] args) throws ParseException {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        System.out.println(DateUtils.parseDate("2018-04-07 00:00:00", pattern).getTime() / 1000);
        System.out.println(DateUtils.parseDate("2018-04-12 23:59:59", pattern).getTime() / 1000);

        System.out.println("T-557".split("T-")[1]);
    }
}
