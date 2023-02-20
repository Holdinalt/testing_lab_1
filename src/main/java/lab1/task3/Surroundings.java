package lab1.task3;

import lab1.task3.entities.Entity;

import java.util.ArrayList;
import java.util.Arrays;

public class Surroundings {

    ArrayList<String> effects = new ArrayList<>();
    Corner corner;

    public Surroundings(){
        corner = new Corner();
    }

    public void addToCornerEntity(Entity entity){
        corner.enterTheCorner(entity);
    }

    public void setEffects(String[] _effects){
        this.effects.addAll(Arrays.asList(_effects));
        printEffects();
    }

    public void printEffects(){
        Arrays.stream(effects.toArray())
                .map(i -> "Вокруг " + i.toString().toLowerCase())
                .forEach(System.out::println);
    }
}
