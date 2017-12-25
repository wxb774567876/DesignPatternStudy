package com.learn.a03_设计模式_装饰者模式.docker;

import com.learn.a03_设计模式_装饰者模式.decoratedperson.Beverage;

/**
 * 摩卡调料:装饰者对象
 * @author    王贤炳
 * @since     2017/12/26
 * @version   V0.1.0
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 取得饮料的描述信息
     *
     * @author 王贤炳
     * @since 2017/12/25
     */
    public String getDescription() {
        return beverage.getDescription() + ",摩卡";
    }

    /**
     * 饮料花费的价格
     *
     * @author 王贤炳
     * @since 2017/12/26
     */
    public double cost() {
        return 0.3 + beverage.cost();
    }
}
