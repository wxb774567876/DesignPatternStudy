package com.learn.a01_设计模式入门_策略模式.bean;

import com.learn.a01_设计模式入门_策略模式.behavior.FlyBehavior;
import com.learn.a01_设计模式入门_策略模式.behavior.QuackBehavior;

/**
 * 鸭子父类
 * @author    王贤炳
 * @since     2017/12/24
 * @version   V0.1.0
 */
public abstract class Duck {
    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    /**
     * 鸭子飞的行为
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * 鸭子叫的行为
     */
    public void performQuack() {
        quackBehavior.quack();
    }
    /**
     * 鸭子的游泳行为
     */
    public void swim() {
        System.out.println("我会游泳");
    }

    /**
     * 鸭子的样子
     */
    public abstract void display();

}
