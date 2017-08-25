package com.jimmy.factory.abstracts;

import com.jimmy.factory.items.AbstractItem;
import com.jimmy.factory.items.ItemXXX;

public class ConcreteXXX extends AbstractFactory {

    private final String str;

    public ConcreteXXX() {
        str = "ConcreteXXX";
    }

    @Override
    public AbstractItem create() {
        return new ItemXXX(str);
    }
}
