package lab1.thirdTask;

import thirdTask.Entities.Bombing;
import thirdTask.Entities.ComputerBank;
import thirdTask.Entities.They;

public class ThirdTask {

    public static void main(String[] args) {
        Surroundings surroundings = new Surroundings();
        surroundings.addToCornerEntity(new They());
        ComputerBank computerBank = new ComputerBank();

        System.out.println("<--- Начало текста --->");

        Bombing bombing = new Bombing(surroundings);
        bombing.giveDamage(computerBank, 30);
    }
}
