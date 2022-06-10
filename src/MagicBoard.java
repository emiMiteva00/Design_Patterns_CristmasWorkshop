import Observer.*;

import java.util.ArrayList;
import java.util.List;

public class MagicBoard implements Observable {

    private List<Observer> dwarfs;
    private Boolean requestBike;
    public MagicBoard()
    {
        this.dwarfs = new ArrayList<>();
    }

    public void needDoll() {
        System.out.println("Santa need a doll");
        this.requestBike = false;
        this.notifyObservers();
    }

    public void needBike() {
        System.out.println("Santa need a bike");
        this.requestBike = true;
        this.notifyObservers();
    }

    @Override
    public void subscribe(Observer observer) {
        this.dwarfs.add(observer);
        observer.setMagicBoard(this);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.dwarfs.remove(observer);
        observer.setMagicBoard(null);
    }

    @Override
    public void notifyObservers() {

        for(Observer dwarf : this.dwarfs) {
            dwarf.update();
        }
    }

    @Override
    public Boolean getUpdate() {
        return this.requestBike;
    }
}
