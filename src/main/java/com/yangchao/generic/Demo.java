package com.yangchao.generic;


public class Demo {

    public static <T> void printMsg( T... args){
        for(T t : args){
            System.out.println("泛型测试,t is " + t);
        }
    }

    public static void main(String[] args) {
        printMsg("string", 2, 3, 0x22);
    }
}
