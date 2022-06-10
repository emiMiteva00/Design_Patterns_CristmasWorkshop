import Command.Command;

public class NeedDoll implements Command {

    private MagicBoard magicBoard; //reciever

    public NeedDoll(MagicBoard magicBoard)
    {
        this.magicBoard = magicBoard;
    }

    public void execute() {
        //System.out.println("Doll");
        this.magicBoard.needDoll();
    }
}
