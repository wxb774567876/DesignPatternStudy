package com.learn.a01_设计模式入门_策略模式.behavior.flyimpl;

import com.learn.a01_设计模式入门_策略模式.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("我会飞");
    }
}
