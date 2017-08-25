package com.jimmy.prototype;

public abstract class IPrototype<T extends IPrototype> {
    public abstract T cloneObj();
}
