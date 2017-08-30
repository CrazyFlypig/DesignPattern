package StrategyPattern;

/**
 * 火箭飞行类
 *
 * @author cc
 * @create 2017-08-30-19:54
 */

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
