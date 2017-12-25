package com.learn.a01_设计模式入门_策略模式.bean.child;

import com.learn.a01_设计模式入门_策略模式.bean.Duck;
import com.learn.a01_设计模式入门_策略模式.behavior.flyimpl.FlyNoWay;
import com.learn.a01_设计模式入门_策略模式.behavior.quackimpl.Squeak;

/**
 * 红头鸭
 * @author    王贤炳
 * @since     2017/12/24
 * @version   V0.1.0
 */
public class Duck01 extends Duck {
    public Duck01() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    /**
     * 鸭子的长相
     * @author    王贤炳
     * @since     2017/12/24
     *
     */
    public void display() {
        System.out.println("我是红头鸭");
    }
}
