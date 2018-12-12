public class Inventory {
    private Object[] inv;

    public Inventory(){ }
    public Inventory(Object[] x){ inv = x; }

    public String toString() {
        String x = "";
        for(int i = 0;i < inv.length;i++){
            if(inv[i] == null)
                x += "empty, ";
            else {
                x += (inv[i].toString());
                x += ", ";
            }
        }
        return x;
    }

    public void addItem(InventoryItem x){
        for(int i = 0;i < inv.length;i++){
            if(inv[i] == (null) ){
                inv[i] = x;
                break;
            } else if(inv[i].toString().equalsIgnoreCase("empty")){
                inv[i] = x;
                break;
            }
        }
    }

    public void removeItem(InventoryItem x){
        for(int i = 0;i < inv.length;i++){
            if(inv[i].equals(x)){
                inv[i] = null;
            }
        }
    }
}
