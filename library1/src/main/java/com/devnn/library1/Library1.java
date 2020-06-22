package com.devnn.library1;


import android.content.Context;

import com.devnn.ILibrary;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * create by nannan on 2020/6/10
 */
public class Library1 implements ILibrary {
    public String hello() {
        return "hello,I am Library1";
    }

    public String call() {
        String message = "";
        try {
            Class mClass = Class.forName("com.devnn.library2.Library2");
            Constructor constructor = mClass.getConstructor(Context.class);
            ILibrary library2 = (ILibrary) constructor.newInstance();
            message = library2.hello();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return message;
    }
}
