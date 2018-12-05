public class Object extends Entity {
    public String name;
    public boolean accessible;
    public Object(){

    }
    public Object(String n){
        name = n;
    }
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
