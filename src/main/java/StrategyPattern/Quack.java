package StrategyPattern;

/**
 * 一般鸭子叫
 *
 * @author cc
 * @create 2017-08-30-19:29
 */

public class Quack implements QuackBehavior{
    public void quack() {
        System.out.println("Quack.");
    }
}
