import java.lang.reflect.Array;
import java.util.Arrays;
public class Store {

    // add item
    public void addItem(Inventory inventory, Item item) {
        if (!inventory.isItemInStock(item)) {
            inventory.addItemToInventory(item);
            System.out.println("item added to inventory");
        } else {
            System.out.println("item already exist in inventory");
        }
    }

    // delete item

    // manage sales

    // check inventory

    public static void main(String[] args) {
        System.out.println("Welcome to the store!");
        // interaction with user
        Inventory inventory = new Inventory();
        Store store = new Store();
        Item apple = new Item("Apple", 0.1, 10, 1);
//        double[] arr1 = apple.showSalePrices(20);
//        System.out.println(Arrays.toString(arr1));

        store.addItem(inventory, apple);
        store.addItem(inventory, apple);

    }
}
