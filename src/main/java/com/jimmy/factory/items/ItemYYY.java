package com.jimmy.factory.items;

public class ItemYYY extends AbstractItem {

    private final String str;

    public ItemYYY(String str) {
        this.str = str;
    }

    @Override
    public void method() {
        System.out.println(str + " ItemYYY");
    }
}
