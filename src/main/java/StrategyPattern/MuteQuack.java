package StrategyPattern;

/**
 * 不会叫鸭子类
 *
 * @author cc
 * @create 2017-08-30-19:30
 */

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
