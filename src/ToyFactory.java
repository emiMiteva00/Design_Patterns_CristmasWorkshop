
public class ToyFactory extends AbstractFactory {



    @Override
    Toy getToy(String toyType) {
        if(toyType.equals("Doll")) {
            return new Doll();
        }

        if(toyType.equals("Bike")) {
            return new Bike();
        }
        System.out.println("Unknown toy");
        return null;
    }
}
