package chainofResponsibility;

public class Client {
    public static void main(String[] args) {
        Handle handle=new ConcreteHandle();
        Handle handle1=new ConcreteHandle();
        handle.setSuccessor(handle1);
        handle.handleRequest();
    }
}
