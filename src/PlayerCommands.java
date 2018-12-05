public class PlayerCommands extends EscapeTheRoom {
    public static void interact(Entity x){
        System.out.println("Inside " + x.getName() + " you found " + x.getImmediateInventory());
    }
    public static void interact(Object x){
        if(x.getAccessible()){
            System.out.println(x.getImmediateInventory());
        }else{
            System.out.println("invalid input");
        }
    }
}
