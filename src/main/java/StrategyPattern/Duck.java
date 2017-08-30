package StrategyPattern;

/**
 * 鸭子类
 *
 * @author cc
 * @create 2017-08-30-19:16
 */

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    private String name;
    private int age;

    public Duck(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
