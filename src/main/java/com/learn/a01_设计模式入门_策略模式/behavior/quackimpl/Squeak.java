package com.learn.a01_设计模式入门_策略模式.behavior.quackimpl;

import com.learn.a01_设计模式入门_策略模式.behavior.QuackBehavior;

/**
 * 吱吱叫的鸭子行为实现类
 */
public class Squeak implements QuackBehavior{
    /**
     * 鸭子叫的行为
     */
    public void quack() {
        System.out.println("鸭子吱吱叫");
    }
}
