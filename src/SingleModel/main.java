package SingleModel;

/**
 * Created by YS-GZD-1495 on 2017/8/25.
 */
public class main {
    public static void main(String[] args) {
        HungerSingleton.getHungerSingleton().test();
        HungerSinlgeton2.getHungerSinlgeton2().test();
        FullSingleton.getFullSingleton().test();
        DCSingleton.getSingleton().test();
        StaticInnerClassSingleton.getSingleton().test();
        EnumSingleton.INSTANCE.test();

    }

}
