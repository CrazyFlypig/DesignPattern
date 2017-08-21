package Singleton;

/**
 * 饿汉式单例设计模式
 *
 * @author cc
 * @create 2017-08-21-15:24
 */

public class SingletonHungry {
    private static SingletonHungry singleton = new SingletonHungry();
    private SingletonHungry(){}
    public static SingletonHungry getInstance(){
        return singleton;
    }
}
