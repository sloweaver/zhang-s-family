package com.sloweaver.springbootinit.utils;

/**
 *  @author sloweaver
 *  @date 2023/03/25
 */
public class TestM {
    public static void main(String[] args) {
        String str = System.getProperty("user.home");
        System.out.println(str);
        TextTranslate.translate();
    }
}
