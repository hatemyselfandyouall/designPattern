package builder;

public class ConcreteBuilder extends Builder{

    private Product product=new Product();
    @Override
    public void buildPart1() {
        System.out.println("builderPart1 of product");
    }

    @Override
    public void buildPart2() {
        System.out.println("builderPart2 of product");

    }

    @Override
    public Product retrieveResult() {
        return null;
    }
}
