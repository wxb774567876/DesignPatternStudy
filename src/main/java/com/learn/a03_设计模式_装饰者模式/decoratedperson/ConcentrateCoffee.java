package com.learn.a03_设计模式_装饰者模式.decoratedperson;

/**
 * 浓缩咖啡
 * @author    王贤炳
 * @since     2017/12/26
 * @version   V0.1.0
 */
public class ConcentrateCoffee extends Beverage{
    public ConcentrateCoffee() {
        description = "浓缩咖啡";
    }

    /**
     * 饮料花费的价格
     *
     * @author 王贤炳
     * @since 2017/12/26
     */
    public double cost() {
        return 15;
    }
}
