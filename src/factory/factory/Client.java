package factory.factory;

public class Client {
    public static void main(String[] args) {
        System.out.println(new ConcreteCreator1().factory());
        System.out.println(new ConcreteCreator2().factory());
    }
}
