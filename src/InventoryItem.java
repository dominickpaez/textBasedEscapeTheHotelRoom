public class InventoryItem extends Object {
    private String name;

    public InventoryItem(String name) {
        this.name = name;
    }

    public String toString() {
        accessible = true;
        return (name);
    }

    public String getName() {
        return (name);
    }

    public void setName(String n) {
        name = n;
    }
}
