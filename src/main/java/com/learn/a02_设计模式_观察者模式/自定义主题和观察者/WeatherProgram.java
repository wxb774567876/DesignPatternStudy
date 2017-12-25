package com.learn.a02_设计模式_观察者模式.自定义主题和观察者;

import com.learn.a02_设计模式_观察者模式.自定义主题和观察者.display.DisplayElement;
import com.learn.a02_设计模式_观察者模式.自定义主题和观察者.observer.Billboard1;
import com.learn.a02_设计模式_观察者模式.自定义主题和观察者.observer.Billboard2;
import com.learn.a02_设计模式_观察者模式.自定义主题和观察者.observer.Billboard3;
import com.learn.a02_设计模式_观察者模式.自定义主题和观察者.observer.Observer;
import com.learn.a02_设计模式_观察者模式.自定义主题和观察者.subject.WeatherData;

/**
 * 主运行类
 * @author    王贤炳
 * @since     2017/12/24
 * @version   V0.1.0
 */
public class WeatherProgram {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        DisplayElement billboard1 = new Billboard1(weatherData);
        DisplayElement billboard2 = new Billboard2(weatherData);
        DisplayElement billboard3 = new Billboard3(weatherData);

        weatherData.testMeasurementsChanged(26, 0.7, 98);
        System.out.println();
        //第二次气象站测量值发生变化时,因为温度变化不到1摄氏度,所以不会通知到观察者
        weatherData.testMeasurementsChanged(26.5, 0.8,100);
        System.out.println();
        weatherData.testMeasurementsChanged(28.5, 0.8,100);
        System.out.println();
        weatherData.testMeasurementsChanged(36.5, 0.5,77);
    }
}
