package com.learn.a01_设计模式入门_策略模式.behavior.flyimpl;

import com.learn.a01_设计模式入门_策略模式.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    /**
     * 鸭子飞的行为
     */
    public void fly() {
        System.out.println("我不会飞行");
    }
}
