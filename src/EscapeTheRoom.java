import java.util.Scanner;

public class EscapeTheRoom {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Commands:\nPlayerCommands (noun):Will interact with the given noun\nPick up (item): Will pick up given item and place in inventory\nUse (item) (noun): Will use given item on the noun\nCraft (item) (item): Will craft an item from the two items given\n");
        System.out.println("You awaken in a barren room. You look out the window and you are in a highriser hotel.\nThe bedroom contains a; bed, nightstand, tv stand, the front door, and the bathroom door.");

        //Initialize objects
        Entity bed = new Entity();
        Object pillow = new Object();
        InventoryItem note1 = new InventoryItem();
        Object[][] bedObjects ={{pillow},{note1}};
        Inventory bedInv = new Inventory(bedObjects,bed);
        bed = new Entity("bed",bedInv);

        System.out.println(bed);

        Entity stand = new Entity();
        Object drawer = new Object();
        InventoryItem note2 = new InventoryItem();
        Object[][] standObjects ={{drawer},{note2}};
        Inventory standInv = new Inventory(standObjects,stand);
        stand = new Entity("Nightstand",standInv);

        Entity tvstand = new Entity();
        Object lamp = new Object();
        InventoryItem socket = new InventoryItem();
        InventoryItem rod = new InventoryItem();
        InventoryItem cord = new InventoryItem();
        Object[][] tvstandObjects ={{lamp},{socket,rod,cord}};
        Inventory tvstandInv = new Inventory(tvstandObjects,tvstand);
        tvstand = new Entity("TV Stand",tvstandInv);

        Entity door = new Entity();
        Object keyCodeLock = new Object();
        Object[][] doorObject ={{keyCodeLock}};
        Inventory doorInv = new Inventory(doorObject,door);
        door = new Entity("Front Door",doorInv);

        Entity bathdoor = new Entity();
        Object keyLock = new Object();
        Object[][] bathdoorObjects ={{keyLock}};
        Inventory bathdoorInv = new Inventory(bathdoorObjects,bathdoor);
        bathdoor = new Entity("Bathroom Door",bathdoorInv);

        Entity sink = new Entity();
        Object cupboard = new Object();
        InventoryItem lockBreaker = new InventoryItem();
        Object[][] sinkObjects ={{cupboard},{lockBreaker}};
        Inventory sinkInv = new Inventory(sinkObjects,sink);
        sink = new Entity("Sink",sinkInv);

        String[] entityNameList = {"bed","nightstand","tvStand","frontDoor","bathroomDoor"};
        Entity[] entityList = {bed,stand,tvstand,door,bathdoor};

        boolean x = false;
        while (!x){
            System.out.print ("Enter command: ");
            String input = scan.nextLine();
            String[] splitted = input.split("\\s+");
            if(splitted[0].equalsIgnoreCase("interact")) {
                for(int i = 0;i < entityNameList.length;i++) {
                    if(splitted[1].equalsIgnoreCase(entityNameList[i]))
                        PlayerCommands.interact(entityList[i]);
                }
            }else if(splitted[0].equalsIgnoreCase("Pick") && splitted[1].equalsIgnoreCase("up") ) {

            }else if(splitted[0].equalsIgnoreCase("Use")) {

            }else if(splitted[0].equalsIgnoreCase("Craft")) {

            }else if(splitted[0].equalsIgnoreCase("Quit")) {
                x = true;
            }else{
                System.out.println("Invalid input try again");
            }
            x = false;
        }
        }

    }
