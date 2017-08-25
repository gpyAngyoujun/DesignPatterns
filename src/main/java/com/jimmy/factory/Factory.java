package com.jimmy.factory;

import com.jimmy.factory.abstracts.AbstractFactory;
import com.jimmy.factory.methods.Methods;
import com.jimmy.factory.simple.Simple;

public class Factory {
    public static AbstractFactory Abstract = null;
    public static final Methods Methods = new Methods();
    public static final Simple Simple = new Simple();
}
