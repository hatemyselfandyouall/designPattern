package SingleModel;

/**
 * Created by YS-GZD-1495 on 2017/8/25.
 */
public class HungerSinlgeton2 {
    private static HungerSinlgeton2 hungerSinlgeton2;
    static {
        hungerSinlgeton2=new HungerSinlgeton2();
    }
    private HungerSinlgeton2(){}
    public static HungerSinlgeton2 getHungerSinlgeton2(){
        return hungerSinlgeton2;
    }
    public void test(){
        System.out.println("test hunger2");
    }
}
