import java.util.ArrayList;
import java.util.Scanner;

public class EscapeTheRoom {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Commands:\nInteract (noun):Will interact with the given noun\nPick up (item): Will pick up given item and place in inventory\nUse (item) (noun): Will use given item on the noun\nCraft (item) (item): Will craft an item from the two items given\n");
        System.out.println("You awaken in a barren room. You look out the window and you are in a highriser hotel.\nThe bedroom contains a; bed, nightstand, tv stand, the front door, and the bathroom door.");

        //Initialize objects
        Object pillow = new Object();
        InventoryItem note1 = new InventoryItem();
        Object[][] bedObjects ={{pillow},{note1}};
        Inventory bedInv = new Inventory();
        Entity bed = new Entity("bed",bedInv);

        Object drawer = new Object();
        InventoryItem note2 = new InventoryItem();
        Object[][] standObjects ={{drawer},{note2}};
        Inventory standInv = new Inventory();
        Entity stand = new Entity("Nightstand",standInv);

        Object lamp = new Object();
        InventoryItem socket = new InventoryItem();
        InventoryItem rod = new InventoryItem();
        InventoryItem cord = new InventoryItem();
        Object[][] tvstandObjects ={{lamp},{socket,rod,cord}};
        Inventory tvstandInv = new Inventory();
        Entity tvstand = new Entity("TV Stand",tvstandInv);

        Object cupboard = new Object();
        InventoryItem note3 = new InventoryItem();
        Object[][] doorObject ={{drawer},{note2}};
        Inventory doorInv = new Inventory();
        Entity door = new Entity("Front Door",doorInv);

        Object keyLock = new Object();
        InventoryItem note4 = new InventoryItem();
        Object[][] bathdoorObjects ={{drawer},{note2}};
        Inventory bathdoorInv = new Inventory();
        Entity bathdoor = new Entity("Bathroom Door",bathdoorInv);

        Object cupboard = new Object();
        InventoryItem note5 = new InventoryItem();
        Object[][] sinkObjects ={{drawer},{note2}};
        Inventory standInv = new Inventory();
        Entity stand = new Entity("Nightstand",standInv);

        boolean x = false;
        while (!x){
            x = promptUser(scan);
        }

    }
    public static boolean promptUser(Scanner scan) {
        System.out.print ("Enter command: ");
        String input = scan.nextLine();
        String[] splitted = input.split("\\s+");
        if(splitted[0].equalsIgnoreCase("Interact")) {

        }else if(splitted[0].equalsIgnoreCase("Pick") && splitted[1].equalsIgnoreCase("up") ) {

        }else if(splitted[0].equalsIgnoreCase("Use")) {

        }else if(splitted[0].equalsIgnoreCase("Craft")) {

        }else if(splitted[0].equalsIgnoreCase("Quit")) {
            return true;
        }else{
            System.out.println("Invalid input try again");
        }
        return false;
    }

}
