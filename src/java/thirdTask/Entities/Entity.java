package thirdTask.Entities;

public abstract class Entity {

    public String name;
    int life = 100;

    public Entity takeDamage(int damage){
        life -= damage;
//        printLife();
        return null;
    }

    public void printLife(){
        System.out.println("Состояние " + name + " = " + life + "%");
    }

    public void CloseCallback(Entity entity){

    }
}
