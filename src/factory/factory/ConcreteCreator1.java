package factory.factory;

public class ConcreteCreator1 implements Creator {
    @Override
    public Product factory() {
        return new ConcretePruduct1();
    }
}
