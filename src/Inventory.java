public class Inventory {
    private Object[][] inv;
    private Entity owner;
    public Inventory(Object[][] x,Entity y){
        inv = x;
        owner = y;
    }

    public String entityToString() {
        String x = "";
        for(int i = 0;i < inv.length-1;i++){
            x += (inv[i][0]);
        }
        return x;
    }
    public String objectToString() {
        String x = "";
        for(int i = 0;i < inv.length-1;i++){
            x += (inv[i][1]);
        }
        return x;
    }
}
