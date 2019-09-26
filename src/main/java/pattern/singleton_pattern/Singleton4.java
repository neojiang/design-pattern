package pattern.singleton_pattern;

/**
 * @author: neojiang
 * @date: 2019/9/26
 * @description: 单例模式 - 懒汉式
 * 优点：
 *      懒加载,多线程下是线程安全的
 * 缺点：
 *      getInstance()是同步方法，每次获取性能较差。
 **/
public class Singleton4 {

    // 实例
    private static Singleton4 instance;


    // 私有化构造函数，防止被外部创建
    private Singleton4() {
    }

    // 获取实例的方法
    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }

    public static void main(String[] args) {
        singleThead();
    }

    private static void singleThead() {
        Singleton4 instance1 = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

    private static void multiThread() {
        for (int i = 0; i < 20; i++) {
            new Thread(()->{
                System.out.println(Singleton4.getInstance());
            }).start();
        }
    }
}
