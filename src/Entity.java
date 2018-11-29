public class Entity {
    private String name;
    Inventory inventory;

    public Entity(){
        name = "Default";
    }

    public Entity(String n,Inventory i){
        name = n;
        inventory = i;
    }


}
