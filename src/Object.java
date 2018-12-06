public class Object extends Entity {
    public boolean accessible;
    public Object(){}
    public Object(String n,Inventory i)
    {
        super(n,i);
    }
    public String toString() {
        accessible = true;
        return(super.toString());
    }
    public boolean getAccessible(){
        return accessible;
    }

}
