package com.learn.a02_设计模式_观察者模式.自定义主题和观察者.observer;
/**
 * 自定义观察者接口
 * @author    王贤炳
 * @since     2017/12/24
 * @version   V0.1.0
 */
public interface Observer {
    /**
     * 供主题调用，接收最新的通知
     * @param  temperature  温度值
     * @param  humidity     湿度值
     * @param  pressure     压力值
     * @author    王贤炳
     * @since     2017/12/24
     */
    void update(double temperature, double humidity, double pressure);
}
