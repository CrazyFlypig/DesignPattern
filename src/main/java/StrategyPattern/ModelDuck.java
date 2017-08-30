package StrategyPattern;

/**
 * 模型鸭
 *
 * @author cc
 * @create 2017-08-30-19:41
 */

public class ModelDuck extends Duck {
    public ModelDuck(String name, int age) {
        super(name, age);
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    public void display(){
        System.out.println("I'm a model duck.");
    }
}
