import Command.Command;


public class NeedBike implements Command {

    private MagicBoard magicBoard; //reciever

    public NeedBike(MagicBoard magicBoard)
    {
        this.magicBoard = magicBoard;
    }

    public void execute() {

      // System.out.println("Bike");
        this.magicBoard.needBike();
    }
}
