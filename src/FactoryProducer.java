public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryName) {

        if(factoryName.equals("Doll")) {
            return new ToyFactory();
        }

        if(factoryName.equals("Bike")) {
            return new ToyFactory();
        }

        System.out.println("Unknown factory");
        return null;

    }

}
