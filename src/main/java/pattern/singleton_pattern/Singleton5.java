package pattern.singleton_pattern;

/**
 * @author: neojiang
 * @date: 2019/9/26
 * @description: 单例模式 - 双重检查
 *
 * 懒加载,多线程下是线程安全的
 *
 *
 **/
public class Singleton5 {

    // 实例
    private static volatile Singleton5 instance;


    // 私有化构造函数，防止被外部创建
    private Singleton5() {
    }

    // 获取实例的方法
    public static  Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        singleThead();
    }

    private static void singleThead() {
        Singleton5 instance1 = Singleton5.getInstance();
        Singleton5 instance2 = Singleton5.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
