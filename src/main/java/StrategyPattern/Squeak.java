package StrategyPattern;

/**
 * 吱吱叫类
 *
 * @author cc
 * @create 2017-08-30-19:31
 */

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
