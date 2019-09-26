package pattern.singleton_pattern;

/**
 * @author: neojiang
 * @date:  2019/9/26
 * @description: 单例模式 - 静态内部类
 *
 * 基于类装载的机制来保证初始化实例时只有一个线程。
 *
 * 静态内部类方式在Singleton5类被装载时并不会立即实例化，在调用getInstance方法，
 * 才会装载Singleton5类，从而完成Singleton5的实例化。
 *
 * 类的静态属性只会在第一次加载类的时候初始化，JVM保证了线程的安全性。
 * 在类进行初始化时，其他的线程是无法进入的。
 *
 * 线程安全，利用静态内部类特点实现延迟加载，效率高
 *
 *
 **/
public class Singleton6 {

    // 实例
    private static  Singleton6 instance;


    // 私有化构造函数，防止被外部创建
    private Singleton6() {
    }

    private static class SingletonInstance {
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    // 获取实例的方法
    public static Singleton6 getInstance() {
        return SingletonInstance.INSTANCE;
    }

    public static void main(String[] args) {
        Singleton6 instance1 = Singleton6.getInstance();
        Singleton6 instance2 = Singleton6.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}
