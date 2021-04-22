import java.lang.reflect.Array;
import java.util.Arrays;
public class Store {

    // add item
    public static void addItem(Item item) {
        if (!Inventory.isItemInStock(item)) {
            Inventory.addItemToInventory(item);
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
        Item apple = new Item("Apple", 0.1, 10, 1);
        double[] arr1 = apple.showSalePrices(20);
        System.out.println(Arrays.toString(arr1));

    }
}
