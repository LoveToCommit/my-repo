 package singeleton;
//Initialization-on-demand holder idiom
 public final class Singleton {
     // Private constructor. Prevents instantiation from other classes.
     private Singleton() { }

     /**
      * Initializes singleton.
      *
      * {@link SingletonHolder} is loaded on the first execution of {@link Singleton#getInstance()} or the first access to
      * {@link SingletonHolder#INSTANCE}, not before.
      */
     private static class SingletonHolder {
             private static final Singleton INSTANCE = new Singleton();
     }

     public static Singleton getInstance() {
             return SingletonHolder.INSTANCE;
     }
}