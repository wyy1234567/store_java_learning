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

    // return an array that tell [regularPrice, salePrice], salePrice is calculated by func in Sale Class
    public double[] showSalePrices(int discount) {
        double[] priceArr = new double[2];
        priceArr[0] = price;
        priceArr[1] = Sale.calculateSalePrice(this.price, discount);
        return priceArr;
    }
}
