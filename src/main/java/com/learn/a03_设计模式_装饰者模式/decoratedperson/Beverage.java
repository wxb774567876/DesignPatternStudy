package com.learn.a03_设计模式_装饰者模式.decoratedperson;
/**
 * 饮料:被装饰者抽象类,也可以定义为接口类型
 * @author    王贤炳
 * @since     2017/12/25
 * @version   V0.1.0
 */
public abstract class Beverage {
    String description = "未知的饮料";

    /**
     * 取得饮料的描述信息
     * @author    王贤炳
     * @since     2017/12/25
     */
    public String getDescription() {
        return description;
    }

    /**
     * 饮料花费的价格
     * @author    王贤炳
     * @since     2017/12/26
     */
    public abstract double cost();
}
