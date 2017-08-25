package com.jimmy.prototype;

public class ConcretePrototype extends IPrototype<ConcretePrototype> {

    private Item item;

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public ConcretePrototype cloneObj() {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.item = new Item(this.item.name);
        return prototype;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + item.toString();
    }
}
