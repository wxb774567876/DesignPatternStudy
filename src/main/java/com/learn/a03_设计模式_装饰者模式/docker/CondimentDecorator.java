package com.learn.a03_设计模式_装饰者模式.docker;

import com.learn.a03_设计模式_装饰者模式.decoratedperson.Beverage;

/**
 * 装饰者模式
 * @author    王贤炳
 * @since     2017/12/26
 * @version   V0.1.0
 */
public abstract class CondimentDecorator extends Beverage {
    /**
     * 取得饮料的描述信息
     *
     * @author 王贤炳
     * @since 2017/12/25
     */
    @Override
    public abstract String getDescription();
}
