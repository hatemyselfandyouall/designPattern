package chainofResponsibility;

public class ConcreteHandle extends Handle {
    @Override
    public void handleRequest() {
        if (getSuccessor()!=null){
            System.out.println("handleRequest this request");
            getSuccessor().handleRequest();
        }else {
            System.out.println("handleRequest and do no thing");
        }
    }
}
