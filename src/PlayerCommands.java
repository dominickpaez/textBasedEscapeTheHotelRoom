public class PlayerCommands extends EscapeTheRoom {
    public static void interact(Entity x) {
        if(x.getName().equalsIgnoreCase("Front")) {
            System.out.println("Its locked with a key pad lock, look for the code.\nBe sure to use the USE command.");
        }else if(x.getName().equalsIgnoreCase("Bathroom")){

        } else{
            System.out.println("Inside " + x.getName() + " you found " + x.getImmediateInventory());
        }
    }

    public static void interact(Object x) {
        if (x.getAccessible()) {
            System.out.println("Inside " + x.getName() + " you found " + x.getImmediateInventory());
        } else {
            System.out.println("invalid input");
        }
    }

    public static void pickUp(InventoryItem x, Inventory y) {
        if (x.getAccessible())
            y.addItem(x);
    }

    public static void craft(InventoryItem x, InventoryItem y, Inventory z) {
        if (x.getName().equalsIgnoreCase("note #1") && y.getName().equalsIgnoreCase("note #2")) {
            z.removeItem(y);
            x.setName("Note");
            System.out.println("When the two notes are put together a string of numbers appears, 1 4 3 0.");
            System.out.println("Inventory: " + z.toString());
        }
        if (x.getName().equalsIgnoreCase("lamp socket") && y.getName().equalsIgnoreCase("lamp rod")) {
            z.removeItem(y);
            x.setName("Improvised Wrench");
            System.out.println("You were able to fabricate an improvised wrench");
            System.out.println("Inventory: " + z.toString());
        }
    }
}
