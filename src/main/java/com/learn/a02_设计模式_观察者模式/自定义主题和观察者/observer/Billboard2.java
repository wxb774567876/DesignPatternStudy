package com.learn.a02_设计模式_观察者模式.自定义主题和观察者.observer;

import com.learn.a02_设计模式_观察者模式.自定义主题和观察者.display.DisplayElement;
import com.learn.a02_设计模式_观察者模式.自定义主题和观察者.subject.WeatherData;

/**
 * 第二个布告板:展示温度和气压
 * @author    王贤炳
 * @since     2017/12/24
 * @version   V0.1.0
 */
public class Billboard2 implements Observer,DisplayElement{
    /** 温度*/
    private double temperature;
    /** 压力*/
    private double pressure;
    /** 主题对象*/
    private WeatherData weatherData;

    public Billboard2(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    /**
     * 供主题调用，接收最新的通知
     *
     * @param temperature 温度值
     * @param humidity    湿度值
     * @param pressure    压力值
     * @author 王贤炳
     * @since 2017/12/24
     */
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        display();
    }

    /**
     * 展示布告板的内容
     *
     * @author 王贤炳
     * @since 2017/12/24
     */
    public void display() {
        System.out.print(" 温度:" + temperature + "### 气压:" + pressure);
    }
}
