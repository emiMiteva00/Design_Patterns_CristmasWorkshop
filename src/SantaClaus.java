import Command.Command;

public class SantaClaus {

    private Command command;
    private static SantaClaus instance;

    SantaClaus() {}

    public static SantaClaus getInstance() {
        if(instance==null)
        {
            instance = new SantaClaus();
        }
        return instance;

    }

    public void postMessage(String message) {
        System.out.println("Message: " + message);
    }

    public void setCommand(Command command)
    {
        this.command = command;
    }

    public void request() {
        if(this.command == null)
        {
            System.out.println("No command");
            return;
        }
        this.command.execute();
    }
}
