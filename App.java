package singeleton;

 enum Singleton {
    INSTANCE;
 //The Enum way
    public String method1(String arg1) {
        return arg1;
    }
 
    public String method2(String arg1, String arg2) {
        return arg1 + arg2;
    }
 
    private Singleton() {
        System.out.println("Am I lazy?");
    }
}
 

public class App {
    public static void main(String[] args) {
        System.out.println(Singleton.class.getName());
        System.out.println("Hello World!");
        System.out.println(Singleton.INSTANCE.method1("method1-arg1"));
        System.out.println(Singleton.INSTANCE.method2("method2-arg1", "method2-arg2"));
    }
}