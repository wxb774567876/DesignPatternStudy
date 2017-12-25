package com.learn.a01_设计模式入门_策略模式;

import com.learn.a01_设计模式入门_策略模式.bean.Duck;
import com.learn.a01_设计模式入门_策略模式.bean.child.Duck01;
import com.learn.a01_设计模式入门_策略模式.behavior.flyimpl.FlyWithWings;
import com.learn.a01_设计模式入门_策略模式.behavior.quackimpl.Quack;

/**
 * 主运行方法
 */
public class DuckProgram {
    public static void main(String[] args) {
        Duck duck = new Duck01();
        duck.performFly();
        duck.performQuack();
        //重新设置鸭子飞行和叫的行为实例
        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new Quack());
        duck.performFly();
        duck.performQuack();
    }
}
