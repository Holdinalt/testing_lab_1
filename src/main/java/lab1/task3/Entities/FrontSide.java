package lab1.task3.Entities;

public class FrontSide extends Entity{

    public FrontSide(String mainObj){
        name = "Лицевая сторона " + mainObj;
    }

    public MoltenMetal takeDamage(int damage){
        super.takeDamage(damage);

        if(life <= 40){
            System.out.println(name + " почти вся оплавилась");
            return new MoltenMetal();
        }

        return null;
    }
}
