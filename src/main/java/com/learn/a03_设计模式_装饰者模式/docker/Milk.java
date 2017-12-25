package com.learn.a03_设计模式_装饰者模式.docker;

import com.learn.a03_设计模式_装饰者模式.decoratedperson.Beverage;

/**
 * 牛奶调料:装饰者
 * @author    王贤炳
 * @since     2017/12/26
 * @version   V0.1.0
 */
public class Milk extends CondimentDecorator {
    Beverage beverage = null;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 取得饮料的描述信息
     *
     * @author 王贤炳
     * @since 2017/12/25
     */
    public String getDescription() {
        return beverage.getDescription() + ",牛奶";
    }

    /**
     * 饮料花费的价格
     *
     * @author 王贤炳
     * @since 2017/12/26
     */
    public double cost() {
        return 0.4 + beverage.cost();
    }
}
