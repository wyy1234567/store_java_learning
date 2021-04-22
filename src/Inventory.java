import java.lang.reflect.Array;
import java.util.ArrayList;


public class Inventory {
    public class InventoryInfoItem {
        Item item;
        int stock;
        public InventoryInfoItem(Item item, int stock) {
            this.item = item;
            this.stock = stock;
        }
    }
    public static ArrayList<InventoryInfoItem> inventory;
//    public HashSet<Item>

    public Inventory() {
        System.out.println("This is in Inventory class");
        inventory = new ArrayList<InventoryInfoItem>();

    }

    public boolean isItemInStock(Item item) {
        for (InventoryInfoItem i : inventory) {
            if (i.item == item) {
//                System.out.println("Item found");
                return true;
            }
        }
//        System.out.println("Item not found");
        return false;
    }

    // ["item name: , stock: , price: ?",]
    public void printInventory(){
        System.out.format("%16s%10s%10s", "Item Name", "Stock", "Price");
        System.out.println();
        for (InventoryInfoItem i : inventory) {
            System.out.format("%16s%10d%10.2f", i.item.name, i.stock, i.item.price);
            System.out.println();
        }
    }

}

/*
Item Name       Stock     Price
Apple           10        $0.10
 */

/*
(inventoryInfo){item: {name: "Banana", price: 0.25}, stockNumber: 100},
{name: "Apple", price: 0.25},
{name: "Orange", price: 0.25},
{name: "Pear", price: 0.25},
*/