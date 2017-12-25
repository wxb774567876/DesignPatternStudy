package com.learn.a03_设计模式_装饰者模式;

import com.learn.a03_设计模式_装饰者模式.decoratedperson.Beverage;
import com.learn.a03_设计模式_装饰者模式.decoratedperson.DarkICoffee;
import com.learn.a03_设计模式_装饰者模式.decoratedperson.DecafCoffee;
import com.learn.a03_设计模式_装饰者模式.docker.Milk;
import com.learn.a03_设计模式_装饰者模式.docker.MilkFoam;
import com.learn.a03_设计模式_装饰者模式.docker.Mocha;

/**
 * 主运行程序
 * @author    王贤炳
 * @since     2017/12/26
 * @version   V0.1.0
 */
public class CoffeeProgram {
    public static void main(String[] args) {
        Beverage beverage = new DarkICoffee();
        System.out.println("描述:" + beverage.getDescription() + " 价格:" + beverage.cost());

        Beverage beverage1 = new DarkICoffee();
        beverage1 = new Milk(beverage1);
        beverage1 = new MilkFoam(beverage1);
        beverage1 = new Milk(beverage1);
        System.out.println("描述:" + beverage1.getDescription() + " 价格:" + beverage1.cost());

        Beverage beverage2 = new DecafCoffee();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Milk(beverage2);
        System.out.println("描述:" + beverage2.getDescription() + " 价格:" + beverage2.cost());
    }
}
