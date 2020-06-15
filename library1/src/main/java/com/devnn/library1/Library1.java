package com.devnn.library1;


import com.devnn.library2.Library2;

/**
 * create by nannan on 2020/6/10
 */
public class Library1 {
    public static String hello(){
        return "hello,I am Library1";
    }
    public static String call(){
        return Library2.hello();
    }
}
