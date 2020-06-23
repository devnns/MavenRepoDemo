package com.devnn.commonlibrary;

import android.content.Context;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * create by nannan on 2020/6/23
 */
public class LibraryLoader {

    public static ILibrary getLibrary1() {
        ILibrary library = loadLibrary("com.devnn.library1.Library1");
        return library;
    }

    public static ILibrary getLibrary2() {
        ILibrary library = loadLibrary("com.devnn.library2.Library2");
        return library;
    }

    private static ILibrary loadLibrary(String path) {
        ILibrary library = null;
        try {
            Class mClass = Class.forName(path);
            Constructor constructor = mClass.getConstructor();
            library = (ILibrary) constructor.newInstance();
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
        return library;
    }
}
