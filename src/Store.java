import java.lang.reflect.Array;
import java.util.Arrays;
public class Store {

    // add new item into our store, add a new InventoryInfoItem into inventory
    // item must be new to the store
    public void createNewItemInInventory(Inventory inventory, Item item, int amount) {
        // Item already exists
        if(inventory.isItemInStock(item)) {
            System.out.println(item.name + " already exists in inventory, skipping operation");
        }
        // Item doesn't exist yet
        else {
            inventory.inventory.add(inventory.new InventoryInfoItem(item, amount));
            System.out.println(item.name + " added to inventory!");
        }
    }

    // adjust (add or remove) the item stock number, the item must exists in our inventory
    // adding 100 apples
    // adjustItemStock(apple, 100, inventory);
    // removing 50 apples
    // adjustItemStock(apple, -50, inventory);
    public void adjustItemStock(Item item, int num, Inventory inventory){
        // Item not exist in the inventory
        if(!inventory.isItemInStock(item)) {
            System.out.println(item.name + " not exists in inventory, skipping operation");
        }
        // Item exist in the inventory
        else {
            // if iteminventory + num < 0
            Inventory.InventoryInfoItem currentItemInfo = inventory.new InventoryInfoItem(item, num);
            int index = 0;
            for (int i = 0; i < inventory.inventory.size(); i++) {
                if (inventory.inventory.get(i).item == item) {
                    currentItemInfo = inventory.inventory.get(i);
                    index = i;
                    break;
                }
            }

            int newStockNum = currentItemInfo.stock + num;


            // check if the stockNum == 0, remove it from our inventory arraylist
            if (newStockNum <= 0) {
                currentItemInfo.stock = 0;
                inventory.inventory.remove(index);
            } else {
                inventory.inventory.get(index).stock = newStockNum;
            }
        }

    }

    // manage sales

    public static void main(String[] args) {
        System.out.println("Welcome to the store!");
        // interaction with user
        Inventory inventory = new Inventory();
        Store store = new Store();
        Item apple = new Item("Apple", 0.1, 1);
        Item banana = new Item("Banana", .01, 0.5);

        store.createNewItemInInventory(inventory, apple, 100);
        store.createNewItemInInventory(inventory, banana, 10);
        inventory.printInventory();

        store.adjustItemStock(apple, -99,inventory);
        store.adjustItemStock(banana, 50, inventory);
        inventory.printInventory();
    }
}