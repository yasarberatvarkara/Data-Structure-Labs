package game.inventory;

public class Item {

    // Private fields
    private String name;
    private String genre;
    private int stockCount;
    private String serialCode;

    // Constructor
    public Item(String name, String genre,
                int stockCount, String serialCode) {

        this.name = name;
        this.genre = genre;
        this.stockCount = stockCount;
        this.serialCode = serialCode;
    }

    // Public getters
    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getStockCount() {
        return stockCount;
    }

    // Package-private method
    String getSerialCode() {
        return serialCode;
    }

    // Private helper method
    private boolean isAvailable(int quantity) {
        return stockCount >= quantity;
    }

    // Public sell method
    public void sell(int quantity) {

        if (quantity <= 0) {
            System.out.println(
                "WARNING: Quantity must be positive."
            );
            return;
        }

        if (isAvailable(quantity)) {

            stockCount -= quantity;

            System.out.println(
                "Sold " + quantity
                + " copy/copies of " + name
                + ". Remaining stock: " + stockCount
            );

        } else {

            System.out.println(
                "WARNING: Not enough stock for " + name
                + ". Requested: " + quantity
                + ", Available: " + stockCount
            );
        }
    }
}