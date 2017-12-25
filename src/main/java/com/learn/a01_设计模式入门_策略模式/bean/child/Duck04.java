package com.learn.a01_设计模式入门_策略模式.bean.child;

import com.learn.a01_设计模式入门_策略模式.bean.Duck;

/**
 * 木头鸭
 * @author    王贤炳
 * @since     2017/12/24
 * @version   V0.1.0
 */
public class Duck04 extends Duck {
    /**
     * 鸭子的长相
     * @author    王贤炳
     * @since     2017/12/24
     */
    public void display() {
        System.out.println("我是木头鸭");
    }
}
