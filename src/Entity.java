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

    public void performAction(){
        System.out.println(inventory.tostring());
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
}
