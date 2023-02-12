package lab1.thirdTask;

import lab1.thirdTask.Entities.Bombing;
import lab1.thirdTask.Entities.ComputerBank;
import lab1.thirdTask.Entities.They;

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
