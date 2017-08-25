package com.jimmy.factory.items;

public class ItemXXX extends AbstractItem {

    private final String str;

    public ItemXXX(String str) {
        this.str = str;
    }

    @Override
    public void method() {
        System.out.println(str + " ItemXXX");
    }
}
