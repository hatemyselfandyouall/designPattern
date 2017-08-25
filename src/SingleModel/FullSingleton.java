package SingleModel;

/**
 * Created by YS-GZD-1495 on 2017/8/25.
 */
public class FullSingleton {
    private static FullSingleton fullSingleton;
    private FullSingleton(){}
    public static FullSingleton getFullSingleton(){
        if(fullSingleton==null){
            fullSingleton=new FullSingleton();
        }
        return fullSingleton;
    }
    public void test(){
        System.out.println("test full");
    }
}
