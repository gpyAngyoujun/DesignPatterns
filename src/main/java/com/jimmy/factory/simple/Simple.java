package com.jimmy.factory.simple;

import com.jimmy.factory.items.AbstractItem;
import com.jimmy.factory.items.ItemXXX;
import com.jimmy.factory.items.ItemYYY;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Simple {
    public AbstractItem create(String type) {
        if ("XXX".equals(type)) {
            return new ItemXXX("Simple");
        } else if ("YYY".equals(type)) {
            return new ItemYYY("Simple");
        }
        return null;
    }

    public <T extends AbstractItem> T create(Class<T> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Constructor<T> constructor = cls.getConstructor(String.class);
            return constructor.newInstance("Simple-create ");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}
