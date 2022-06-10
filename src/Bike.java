//import Factory.Toy;


public class Bike implements Toy {


    @Override
    public void createToy() {
        System.out.println("Making a bike.");
        System.out.println("BMX Bike");
    }
}
