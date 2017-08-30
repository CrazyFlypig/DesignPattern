package StrategyPattern;

/**
 * 测试客户端
 *
 * @author cc
 * @create 2017-08-30-19:37
 */

public class Client {
    public static void main(String[] args) {
        Duck duck = new MallardDuck("mallard duck",20);
        duck.performFly();
        duck.performQuack();
        System.out.println("-------------------------------------");
        ModelDuck duck1 = new ModelDuck("model duck",25);
        duck1.performFly();
        duck1.performQuack();
        duck1.display();
        duck1.setFlyBehavior(new FlyRocketPowered());
        duck1.performFly();
        System.out.println("-------------------------------------");
    }
}
