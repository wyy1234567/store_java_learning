public class Item {

    // name, wholesalePrice, remaining, isOnSale, price
    public String name;
    public double wholesalePrice;
    public int remaining;
    public boolean isOnsale;
    public double price;

    public Item(String newName, double wholesalePrice, int remaining, double price) {
        this.name = newName;
        this.wholesalePrice = wholesalePrice;
        this.remaining = remaining;
        this.price = price;
        this.isOnsale = false;
    }
}
