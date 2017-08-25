package SingleModel;

/**
 * Created by YS-GZD-1495 on 2017/8/25.
 */
public class DCSingleton {
    private static volatile DCSingleton singleton;
    private DCSingleton(){}
    public static DCSingleton getSingleton(){
        if (singleton==null){
            synchronized (DCSingleton.class) {
                if (singleton==null){
                        singleton = new DCSingleton();
                    }
                }
            }
        return singleton;
    }
    public void test(){
        System.out.println("test DCsingle");
    }
}
