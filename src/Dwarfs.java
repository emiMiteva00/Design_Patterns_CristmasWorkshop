import Observer.*;

public class Dwarfs implements Observer {

    private Observable magicBoard;
    private Boolean requestBike;
    private String nickname;
    public Dwarfs(String nickname)
    {
        this.nickname = nickname;

    }
    @Override
    public void update() {
        this.magicBoard.getUpdate();
        if(this.magicBoard == null)
        {
            System.out.println("No magic board.");
            return;
        }
        this.requestBike = magicBoard.getUpdate();
        if(this.requestBike)
        {

            AbstractFactory toyFactory = FactoryProducer.getFactory("Bike");
            Toy bike = toyFactory.getToy("Bike");
            bike.createToy();
            System.out.println(this.nickname + " get a bike");
            System.out.println();
            return;
        }

        AbstractFactory toyFactory = FactoryProducer.getFactory("Doll");
        Toy doll = toyFactory.getToy("Doll");
        doll.createToy();
        System.out.println(this.nickname + " get a doll" );
        System.out.println();
    }

    @Override
    public void setMagicBoard(Observable magicBoard) {
        this.magicBoard = magicBoard;
    }
}
