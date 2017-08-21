package Singleton;

/**
 * “双重检查加锁”懒汉式单例模式
 *
 * @author cc
 * @create 2017-08-21-17:03
 *
 *  使用双重检查可以避免在类被实例化后，对锁的多次无用判断，提升性能。
 *  volatile关键字确保，当singleton变量被初始化成Singleton实例时，
 *  多个线程正确处理singleton变量。
 */

public class SingletonLazyDoubleCheck {
    private volatile static SingletonLazyDoubleCheck singleton = null;
    private SingletonLazyDoubleCheck(){}
    public static SingletonLazyDoubleCheck getInstance(){
        if (singleton == null){
            synchronized (SingletonLazyDoubleCheck.class){
                if (singleton == null){
                    singleton = new SingletonLazyDoubleCheck();
                }
            }
        }
        return singleton;
    }
}
