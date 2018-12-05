public class Object extends Entity {
    public String name;
    public boolean accessible;
    public Object(String n,Inventory i){super(n,i);}
    public String toString() {
        accessible = true;
        return name;
    }
    public boolean getAccessible(){
        return accessible;
    }
    public String getImmediateInventory(){
        return()
    }
}
