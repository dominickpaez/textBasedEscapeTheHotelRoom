public class Entity {
    private String name;
    private Inventory inventory;

    public Entity(){
        name = "Default";
    }

    public Entity(String n,Inventory i){
        name = n;
        inventory = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return (name);
    }

    public String getImmediateInventory(){
        return(inventory.entityToString());
    }
}
