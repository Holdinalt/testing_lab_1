package lab1.thirdTask;

import lab1.thirdTask.Entities.*;

public class ThirdTask {

    public static void main(String[] args) {
//        Surroundings surroundings = new Surroundings();
//        surroundings.addToCornerEntity(new They());
//        ComputerBank computerBank = new ComputerBank();
//
//        System.out.println("<--- Начало текста --->");
//
//        Bombing bombing = new Bombing(surroundings);
//        bombing.giveDamage(computerBank, 30);
        Surroundings surroundings = new Surroundings();
        ComputerBank computerBank = new ComputerBank();
        Bombing bombing = new Bombing(surroundings);
        bombing.giveDamage(computerBank, 15);
        computerBank.printLife();
    }
}
