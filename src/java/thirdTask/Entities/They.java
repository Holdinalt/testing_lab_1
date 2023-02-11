package thirdTask.Entities;

public class They extends Entity{

    public They(){
        name = "Они";
    }

    public void doing(String s){
        System.out.println(name + " решили " + s.toLowerCase());
    }

    @Override
    public void CloseCallback(Entity entity) {
        if(entity.name.equals("Раскаленный металл")){
            doing("Cгрудиться плотнее и ждать конца");
        }
    }
}
