package thirdTask;

import java.util.ArrayList;
import java.util.Arrays;
import thirdTask.Entities.Entity;

public class Corner {
    ArrayList<Entity> entities = new ArrayList<>();

    public Corner(){}
    public Corner(Entity[] _entities){
        this.entities.addAll(Arrays.asList(_entities));
    }

    public void enterTheCorner(Entity entity){
        Entity[] tempEntities =  entities.toArray(new Entity[0]);

        entities.add(entity);
        System.out.println(entity.name + " добавлен в угол");
        printEntities();

        Arrays.stream(tempEntities).forEach(i -> i.CloseCallback(entity));
    }

    public void printEntities(){
        System.out.println("В углу:");
        entities.stream()
                .map(i -> i.name)
                .forEach(System.out::println);
    }
}
