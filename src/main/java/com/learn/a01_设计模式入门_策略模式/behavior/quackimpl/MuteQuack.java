package com.learn.a01_设计模式入门_策略模式.behavior.quackimpl;

import com.learn.a01_设计模式入门_策略模式.behavior.QuackBehavior;

/**
 * 不会叫的鸭子行为实现类
 */
public class MuteQuack implements QuackBehavior{
    /**
     * 鸭子叫的行为
     */
    public void quack() {
        System.out.println("我不会叫");
    }
}
