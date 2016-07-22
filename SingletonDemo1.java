package singeleton;
//Double Checked Locking Lazy Initialization
public final class SingletonDemo1 {
    private static volatile SingletonDemo1 instance;
    private SingletonDemo1() { }
 
    public static SingletonDemo1 getInstance() {
        if (instance == null ) {
            synchronized (SingletonDemo1.class) {
                if (instance == null) {
                    instance = new SingletonDemo1();
                }
            }
        }
 
        return instance;
    }
}