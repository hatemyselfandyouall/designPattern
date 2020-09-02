package builder;

public class Director {

    private Builder builder;

    public void construct(){
        builder=new ConcreteBuilder();
        builder.buildPart1();
        builder.buildPart2();
        builder.retrieveResult();
    }
}
