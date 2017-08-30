package StrategyPattern;

/**
 * 能飞方法类
 *
 * @author cc
 * @create 2017-08-30-19:27
 */

public class FlyWithWings implements FlyBehavior {

    public void fly() {
        System.out.println("I can fly.");
    }
}
