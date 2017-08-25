package com.jimmy.factory.methods;

import com.jimmy.factory.items.AbstractItem;
import com.jimmy.factory.items.ItemXXX;
import com.jimmy.factory.items.ItemYYY;

public class Methods {
    public AbstractItem createXXX() {
        return new ItemXXX("Methods");
    }

    public AbstractItem createYYY() {
        return new ItemYYY("Methods");
    }

}
