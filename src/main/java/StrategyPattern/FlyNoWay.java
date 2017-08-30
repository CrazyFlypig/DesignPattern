package StrategyPattern;

/**
 * 不能非方法类
 *
 * @author cc
 * @create 2017-08-30-19:28
 */

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly.");
    }
}
