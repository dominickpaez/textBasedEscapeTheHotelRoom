import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Commands:\nInteract (noun):Will interact with the given noun\nPick up (item): Will pick up given item and place in inventory\nUse (item) (noun): Will use given item on the noun\nCraft (item) (item): Will craft an item from the two items given\n");
        System.out.println("You awaken in a barren room. You look out the window and you are in a highriser hotel.\nThe bedroom contains a; bed, nightstand, tv stand, the front door, and the bathroom door.");
        boolean x = false;
        while (!x){
            x = promptUser(scan);
        }
        Inventory bedInventory = new Inventory();
        Entity bed = new Entity("bed",bedInventory);
    }
    public static boolean promptUser(Scanner scan) {
        System.out.print ("Enter command: ");
        String input = scan.nextLine();
        String[] splitted = input.split("\\s+");
        if(splitted[0].equalsIgnoreCase("Interact")) {

        }else if(splitted[0].equalsIgnoreCase("Pick") && splitted[1].equalsIgnoreCase("up") ) {

        }else if(splitted[0].equalsIgnoreCase("Use")) {

        }else if(splitted[0].equalsIgnoreCase("Craft")) {

        }else{
            System.out.println("Invalid input try again");
        }
        return false;
    }
}
