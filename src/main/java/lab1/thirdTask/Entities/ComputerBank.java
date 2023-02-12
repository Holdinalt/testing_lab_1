package lab1.thirdTask.Entities;

public class ComputerBank extends Entity{
    FrontSide frontSide;

    public ComputerBank(){
        name = "Компьютерный банк";
        frontSide = new FrontSide("компьютерного банка");
    }

    @Override
    public Entity takeDamage(int damage) {
        super.takeDamage(damage);
        Entity piece;

        piece = frontSide.takeDamage(damage * 2);

        if(piece != null){
            System.out.println(name + " разваливается на куски");
        }

        return piece;
    }
}
