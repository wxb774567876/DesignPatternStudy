package com.learn.a03_设计模式_装饰者模式.decoratedperson;

/**
 * 低咖啡因咖啡
 * @author    王贤炳
 * @since     2017/12/26
 * @version   V0.1.0
 */
public class DecafCoffee extends Beverage{
    public DecafCoffee() {
        description = "低咖啡因咖啡";
    }

    /**
     * 饮料花费的价格
     *
     * @author 王贤炳
     * @since 2017/12/26
     */
    public double cost() {
        return 13.6;
    }
}
