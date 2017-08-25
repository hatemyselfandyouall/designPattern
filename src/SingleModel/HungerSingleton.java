package SingleModel;

/**
 * Created by YS-GZD-1495 on 2017/8/25.
 */
public class HungerSingleton {
    private String test;

    @Override
    public String toString() {
        return "HungerSingleton{" +
                "test='" + test + '\'' +
                '}';
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    private static HungerSingleton hungerSingleton =new HungerSingleton();
    public static HungerSingleton getHungerSingleton(){
        return hungerSingleton;
    }
    private HungerSingleton(){

    }
    public void test(){
        System.out.println("test");
    }
    public static void main(String[] args) {
        hungerSingleton.setTest("test");
        System.out.println(hungerSingleton.toString());
    }
}
