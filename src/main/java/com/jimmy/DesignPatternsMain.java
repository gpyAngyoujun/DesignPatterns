package com.jimmy;

import com.jimmy.builder.Builder;
import com.jimmy.factory.Factory;
import com.jimmy.factory.abstracts.ConcreteXXX;
import com.jimmy.factory.abstracts.ConcreteYYY;
import com.jimmy.factory.items.AbstractItem;
import com.jimmy.factory.items.ItemXXX;
import com.jimmy.factory.items.ItemYYY;
import com.jimmy.prototype.ConcretePrototype;
import com.jimmy.prototype.Item;
import com.jimmy.singleton.Singleton;
import com.jimmy.stragety.StrategyContext;
import com.jimmy.stragety.StrategyXXX;
import com.jimmy.stragety.StrategyYYY;

public class DesignPatternsMain {
    public static void main(String[] args) {
        System.out.println("DesignPatterns-Main");
        printLine();

        /* 单例 */
        singleton();
        /* 建造者 */
        builder();
        /* 工厂 */
        factory();
        /* 原型 */
        prototype();
        /* 策略 */
        strategy();
    }

    private static void strategy() {
        StrategyContext strategy = new StrategyContext();
        strategy.setStrategy(new StrategyXXX());
        strategy.strategy("strategy");
        strategy.setStrategy(new StrategyYYY());
        strategy.strategy("strategy");
        printLine();
    }

    private static void prototype() {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setItem(new Item("Prototype Item"));
        ConcretePrototype clone = prototype.cloneObj(); // 深拷贝，克隆出来的对象是不同的，建议使用 Cloneable
        System.out.println("prototype:\t" + prototype.toString());
        System.out.println("clone:\t\t" + clone.toString());
        printLine();
    }

    private static void factory() {
        AbstractItem item;

        item = Factory.Simple.create("XXX");
        item.method();
        item = Factory.Simple.create("YYY");
        item.method();
        item = Factory.Simple.create(ItemXXX.class);
        item.method();
        item = Factory.Simple.create(ItemYYY.class);
        item.method();

        item = Factory.Methods.createXXX();
        item.method();
        item = Factory.Methods.createYYY();
        item.method();

        Factory.Abstract = new ConcreteXXX();
        item = Factory.Abstract.create();
        item.method();
        Factory.Abstract = new ConcreteYYY();
        item = Factory.Abstract.create();
        item.method();
        printLine();
    }

    private static void builder() {
        Builder build = new Builder.InnerBuilder()
                .title("title-1")
                .message("message-2")
                .id(3)
                .build();
        build.print();
        printLine();
    }

    private static void singleton() {
        Singleton.ins().print();
        printLine();
    }

    private static void printLine() {
        System.out.println("**********");
    }
}
