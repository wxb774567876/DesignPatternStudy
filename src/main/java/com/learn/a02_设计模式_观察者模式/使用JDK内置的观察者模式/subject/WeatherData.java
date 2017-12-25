package com.learn.a02_设计模式_观察者模式.使用JDK内置的观察者模式.subject;

import com.learn.a02_设计模式_观察者模式.自定义主题和观察者.observer.Observer;
import com.learn.a02_设计模式_观察者模式.自定义主题和观察者.subject.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * 气象站实体类
 * @author    王贤炳
 * @since     2017/12/24
 * @version   V0.1.0
 */
public class WeatherData extends Observable{
    /** 温度*/
    private double temperature;
    /** 湿度*/
    private double humidity;
    /** 压力*/
    private double pressure;

    /**
     * 气象站的数据发生更新时触发
     * @author    王贤炳
     * @since     2017/12/24
     */
    public void measurementsChanged() {
        if (hasChanged()) {
            //通知各个观察者
            notifyObservers();
            clearChanged();
        }
    }
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
    /**
     * 模拟气象站数据发生变化时的情况
     * @author    王贤炳
     * @since     2017/12/24
     */
    public void testMeasurementsChanged(double temperature, double humidity, double pressure) {
        if (Math.abs(this.temperature - temperature) > 1) {
            this.setChanged();
        }
        this.setTemperature(temperature);
        this.setHumidity(humidity);
        this.setPressure(pressure);
        measurementsChanged();
    }
}
