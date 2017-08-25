package com.jimmy.stragety;

/**
 * 策略模式
 * 很像代理和状态
 */
public class StrategyContext extends AbstractStrategy {

    private AbstractStrategy strategy;

    public void setStrategy(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void strategy(String name) {
        if (strategy != null) {
            strategy.strategy(name);
        }
    }
}
