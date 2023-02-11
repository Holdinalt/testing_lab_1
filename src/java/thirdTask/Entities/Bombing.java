package thirdTask.Entities;

import thirdTask.Surroundings;

public class Bombing {

    Surroundings surroundings;
    boolean isStarted = false;

    public Bombing(Surroundings _surroundings){
        surroundings = _surroundings;
        StartBombing(surroundings);
    }

    public void StartBombing(Surroundings surroundings){
        isStarted = true;
        System.out.println("Началась Бомбардировка");
        addEffectsToSurroundings(surroundings);
    }

    public void giveDamage(Entity entity, int damage){
        Entity piece = entity.takeDamage(damage);

        if(piece != null){
            surroundings.addToCornerEntity(piece);
        }
    }

    public void addEffectsToSurroundings(Surroundings surroundings){
        surroundings.setEffects(new String[]{"Невообразимый Жар", "Невообразимый Шум"});
    }
}
