public class Shop implements Comparable<Shop> {
    private final String brand;
    private final int price;

    public Shop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Shop o) {
        return o.getPrice() - this.getPrice();
    }
}