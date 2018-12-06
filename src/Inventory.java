public class Inventory {
    private Object[] inv;
    public Inventory(){}
    public Inventory(Object[] x){
        inv = x;
    }

    public String toString() {
        String x = "";
        for(int i = 0;i < inv.length;i++){
            x += (inv[i].toString());
        }
        return x;
    }
}
