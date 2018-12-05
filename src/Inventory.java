public class Inventory {
    private Object[] inv;
    public Inventory(Object[] x){
        inv = x;
    }

    public String entityToString() {
        String x = "";
        for(int i = 0;i < inv.length;i++){
            x += (inv[i]);
        }
        return x;
    }
    public String objectToString() {
        String x = "";
        for(int i = 0;i < inv.length-1;i++){
            x += (inv[i]);
        }
        return x;
    }
}
