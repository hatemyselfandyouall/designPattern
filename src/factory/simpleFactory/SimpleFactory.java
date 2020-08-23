package factory.simpleFactory;

public class SimpleFactory {
    interface Fruit {
        void grow();
        void harvest();
        void plant();
    }
    static class Apple implements Fruit{

        @Override
        public void grow() {
            System.out.println("Apple is growing");
        }

        @Override
        public void harvest() {
            System.out.println("Apple is harvesting");
        }

        @Override
        public void plant() {
            System.out.println("Apple is planting");
        }
    }
    static  class Banana implements Fruit{
        @Override
        public void grow() {
            System.out.println("Banana is growing");
        }

        @Override
        public void harvest() {
            System.out.println("Banana is harvesting");
        }

        @Override
        public void plant() {
            System.out.println("Banana is planting");
        }
    }

    static class Grape implements Fruit{

        private Boolean seedless;
        @Override
        public void grow() {
            System.out.println("Grape is growing");
        }

        @Override
        public void harvest() {
            System.out.println("Grape is harvesting");
        }

        @Override
        public void plant() {
            System.out.println("Grape is planting");
        }

        public Boolean getSeedless() {
            return seedless;
        }

        public void setSeedless(Boolean seedless) {
            this.seedless = seedless;
        }
    }
    public static Fruit factory(String which) throws BadFuritException{
        switch (which){
            case "apple":
                return new Apple();
            case "banana":
                return new Banana();
            case "grape":
                return new Grape();
            default:
                return new Apple();
        }

    }

    public static void main(String[] args) throws BadFuritException {
        factory("apple").grow();
        factory("banana").grow();
        factory("grape").grow();
    }
}
