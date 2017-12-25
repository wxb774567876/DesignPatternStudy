package com.learn.a02_设计模式_观察者模式.自定义主题和观察者.subject;

import com.learn.a02_设计模式_观察者模式.自定义主题和观察者.observer.Observer;

/**
 * 主题接口
 * @author    王贤炳
 * @since     2017/12/24
 * @version   V0.1.0
 */
public interface Subject {
    /**
     * 注册观察者
     * @author    王贤炳
     * @since     2017/12/24
     */
    void registerObserver(Observer observer);

    /**
     * 移除已注册的观察者
     * @author    王贤炳
     * @since     2017/12/24
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     * @author    王贤炳
     * @since     2017/12/24
     */
    void notifyObservers();
}
