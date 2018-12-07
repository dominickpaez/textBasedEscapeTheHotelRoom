import java.util.Scanner;

public class EscapeTheRoom {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Commands:\nInteract (noun):Will interact with the given noun\nPick up (item): Will pick up given item and place in inventory\nUse (item) (noun): Will use given item on the noun\nCraft (item) (item): Will craft an item from the two items given\n");
        System.out.println("You awaken in a barren room. You look out the window and you are in a highriser hotel.\nThe bedroom contains a; bed, nightstand, tv stand, the front door, and the bathroom door.");

        //Initialize objects
        Inventory emptyInv = new Inventory();

        Entity bed;
        InventoryItem note1 = new InventoryItem("note #1");
        InventoryItem[] pillowItems = {note1};
        Inventory pillowInv = new Inventory(pillowItems);
        Object pillow = new Object("pillow",pillowInv);
        Object[] bedObjects ={pillow};
        Inventory bedInv = new Inventory(bedObjects);
        bed = new Entity("bed",bedInv);

        Entity stand = new Entity();
        InventoryItem note2 = new InventoryItem("note #2");
        InventoryItem[] drawerItems = {note2};
        Inventory drawerInv = new Inventory(drawerItems);
        Object drawer = new Object("drawer",drawerInv);
        Object[] standObjects ={drawer};
        Inventory standInv = new Inventory(standObjects);
        stand = new Entity("Nightstand",standInv);

        Entity tvstand = new Entity();
        InventoryItem socket = new InventoryItem("lamp socket");
        InventoryItem metalRod = new InventoryItem("lamp rod");
        InventoryItem extensionCord = new InventoryItem("extension cord");
        InventoryItem[] lampItems = {socket, metalRod, extensionCord};
        Inventory lampInv = new Inventory(lampItems);
        Object lamp = new Object("lamp",lampInv);
        Object[] tvstandObjects ={lamp};
        Inventory tvstandInv = new Inventory(tvstandObjects);
        tvstand = new Entity("TV Stand",tvstandInv);

        Entity door = new Entity();
        Object lock = new Object("key lock",emptyInv);
        Object[] doorObjects ={drawer};
        Inventory doorInv = new Inventory(doorObjects);
        door = new Entity("Front Door",doorInv);

        Entity bathroomdoor = new Entity();
        Object keyCodelock = new Object("code lock",emptyInv);
        Object[] bathDoorObjects ={keyCodelock};
        Inventory bathDoorInv = new Inventory(bathDoorObjects);
        door = new Entity("Bathroom Door",bathDoorInv);

        Entity sink = new Entity();
        InventoryItem lockBreaker = new InventoryItem("lock breaker");
        InventoryItem[] cupboardItems = {lockBreaker};
        Inventory cupboardInv = new Inventory(cupboardItems);
        Object cupboard = new Object("cupboard",cupboardInv);
        Object[] sinkObjects ={cupboard};
        Inventory sinkInv = new Inventory(sinkObjects);
        sink = new Entity("Sink",sinkInv);

        String[] entityNameList = {"bed","nightstand","tv stand","front door","bathroom door"};
        Entity[] entityList = {bed,stand,tvstand,door,bathroomdoor};

        String[] objectNameList = {"pillow","drawer","lamp","lock","keycode lock","cupboard"};
        Object[] objectList = {pillow,drawer,lamp,lock,keyCodelock,cupboard};

        boolean x = false;
        while (!x){
            System.out.print ("Enter command: ");
            String input = scan.nextLine();
            String[] splitted = input.split("\\s+");
            if(splitted[0].equalsIgnoreCase("interact")) {
                for(int i = 0;i < entityNameList.length;i++) {
                    if(splitted[1].equalsIgnoreCase(entityNameList[i]))
                        PlayerCommands.interact(entityList[i]);
                    if(splitted[1].equalsIgnoreCase(objectNameList[i]))
                        PlayerCommands.interact(objectList[i]);

                }

            }else if(splitted[0].equalsIgnoreCase("Pick") && splitted[1].equalsIgnoreCase("up") ) {
                for(int i = 0;i < NameList.length;i++) {
                    if(splitted[1].equalsIgnoreCase(entityNameList[i]))
                        PlayerCommands.interact(entityList[i]);

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
