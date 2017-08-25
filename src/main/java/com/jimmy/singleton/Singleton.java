package com.jimmy.singleton;

public class Singleton {
    private static Singleton INS;

    public static Singleton ins() {
        if (INS == null) {
            synchronized (Singleton.class) {
                if (INS == null) {
                    INS = new Singleton();
                }
            }
        }
        return INS;
    }

    private Singleton() {
    }

    public void print() {
        System.out.println("Singleton-print");
    }
}
