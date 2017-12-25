package com.learn.a01_设计模式入门_策略模式.behavior.quackimpl;

import com.learn.a01_设计模式入门_策略模式.behavior.QuackBehavior;

/**
 * 呱呱叫的行为实现类
 */
public class Quack implements QuackBehavior{
    /**
     * 鸭子叫的行为
     */
    public void quack() {
        System.out.println("鸭子呱呱叫");
    }
}
