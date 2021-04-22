import java.lang.reflect.Array;
import java.util.ArrayList;

public class Inventory {

    public static ArrayList<Item> inventory;

    public Inventory() {
        System.out.println("This is in Inventory class");
        inventory = new ArrayList<Item>();
//        inventory.add(new Item("Apple", 0.1, 10, 1));
//        inventory.add(new Item("Banana", 0.1, 10, 1));
    }

    public static boolean isItemInStock(Item item) {
        for (Item i : inventory) {
            if (i == item) {
                System.out.println("Item found");
                return true;
            }
        }
        System.out.println("Item not found");
        return false;
    }

    public static void addItemToInventory(Item item) {
        inventory.add(item);
    }

}
