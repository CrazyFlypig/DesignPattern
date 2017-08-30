package StrategyPattern;

/**
 * 绿头鸭
 *
 * @author cc
 * @create 2017-08-30-19:33
 */

public class MallardDuck extends Duck {
    public MallardDuck(String name, int age) {
        super(name, age);
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    public void display(){
        System.out.println("I'm a real Mallard duck");
    }

}
