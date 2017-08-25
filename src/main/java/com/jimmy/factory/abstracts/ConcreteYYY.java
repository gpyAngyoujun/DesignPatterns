package com.jimmy.factory.abstracts;

import com.jimmy.factory.items.AbstractItem;
import com.jimmy.factory.items.ItemYYY;

public class ConcreteYYY extends AbstractFactory {

    private final String str;

    public ConcreteYYY() {
        str = "ConcreteYYY";
    }

    @Override
    public AbstractItem create() {
        return new ItemYYY(str);
    }
}
