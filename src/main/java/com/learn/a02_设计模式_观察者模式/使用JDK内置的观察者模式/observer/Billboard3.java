package com.learn.a02_设计模式_观察者模式.使用JDK内置的观察者模式.observer;


import com.learn.a02_设计模式_观察者模式.使用JDK内置的观察者模式.display.DisplayElement;
import com.learn.a02_设计模式_观察者模式.使用JDK内置的观察者模式.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * 第三个布告板:展示湿度和气压
 * @author    王贤炳
 * @since     2017/12/24
 * @version   V0.1.0
 */
public class Billboard3 implements DisplayElement,Observer{
    /** 湿度值*/
    private double humidity;
    /** 气压值*/
    private double pressure;
    /** 主题对象*/
    private Observable observable;

    public Billboard3(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }
    /**
     * 展示布告板的内容
     *
     * @author 王贤炳
     * @since 2017/12/24
     */
    public void display() {
        System.out.print(" 湿度:" + humidity + "### 气压:" + pressure);
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
