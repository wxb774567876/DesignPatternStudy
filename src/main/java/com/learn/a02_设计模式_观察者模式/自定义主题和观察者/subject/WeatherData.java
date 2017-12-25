package com.learn.a02_设计模式_观察者模式.自定义主题和观察者.subject;

import com.learn.a02_设计模式_观察者模式.自定义主题和观察者.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 气象站实体类
 * @author    王贤炳
 * @since     2017/12/24
 * @version   V0.1.0
 */
public class WeatherData implements Subject{
    /** 温度*/
    private double temperature;
    /** 湿度*/
    private double humidity;
    /** 压力*/
    private double pressure;
    /** 状态,只有状态值时true的时候才通知各个观察者*/
    private boolean state = false;

    private List<Observer> observers = null;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    /**
     * 气象站的数据发生更新时触发
     * @author    王贤炳
     * @since     2017/12/24
     */
    public void measurementsChanged() {
        if (isState()) {
            //通知各个观察者
            notifyObservers();
            this.setState(false);
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

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    /**
     * 注册观察者
     *
     * @param observer
     * @author 王贤炳
     * @since 2017/12/24
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除已注册的观察者
     *
     * @param observer
     * @author 王贤炳
     * @since 2017/12/24
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者
     *
     * @author 王贤炳
     * @since 2017/12/24
     */
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 模拟气象站数据发生变化时的情况
     * @author    王贤炳
     * @since     2017/12/24
     */
    public void testMeasurementsChanged(double temperature, double humidity, double pressure) {
        if (Math.abs(this.temperature - temperature) > 1) {
            setState(true);
        }
        this.setTemperature(temperature);
        this.setHumidity(humidity);
        this.setPressure(pressure);
        measurementsChanged();
    }
}
