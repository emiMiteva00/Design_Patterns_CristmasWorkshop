//import SantaClaus.SantaClaus;

import Command.*;

public class Start {

    public static void main(String[] args) {

        SantaClaus santaClaus = SantaClaus.getInstance();
        santaClaus.postMessage("Santa Claus is here!");
        System.out.println();
        MagicBoard magicBoard = new MagicBoard();


        Dwarfs dwarf1 = new Dwarfs("d1");
        Dwarfs dwarf2 = new Dwarfs("d2");
        Dwarfs dwarf3 = new Dwarfs("d3");

        magicBoard.subscribe(dwarf1);
        magicBoard.subscribe(dwarf2);
        magicBoard.subscribe(dwarf3);

        Command needABike = new NeedBike(magicBoard);
        Command needADoll = new NeedDoll(magicBoard);

       santaClaus.setCommand(needABike);
       santaClaus.request();

       santaClaus.setCommand(needADoll);
       santaClaus.request();
    }
}
