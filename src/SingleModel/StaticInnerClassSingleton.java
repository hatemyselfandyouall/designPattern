package SingleModel;

/**
 * Created by YS-GZD-1495 on 2017/8/25.
 */
public class StaticInnerClassSingleton {
    private static class SingleHolder{
        private static final StaticInnerClassSingleton INSTANCE=new StaticInnerClassSingleton();
    }
    private StaticInnerClassSingleton(){}
    public static StaticInnerClassSingleton getSingleton(){
        return SingleHolder.INSTANCE;
    }
    public void test(){
        System.out.println("test static inner class");
    }
}
