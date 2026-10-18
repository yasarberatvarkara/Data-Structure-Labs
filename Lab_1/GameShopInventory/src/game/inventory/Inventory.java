package game.inventory;

public class Inventory {

    private Item[] items;
    private int count;

    public Inventory() {

        items = new Item[10];
        count = 0;
    }

    // Add an item
    public void addItem(Item item) {

        if (item == null) {
            throw new IllegalArgumentException(
                "Item cannot be null"
            );
        }

        if (count >= items.length) {
            System.out.println("Inventory is full!");
            return;
        }

        items[count] = item;
        count++;
    }

    // Display public item information
    public void displayAll() {

        System.out.println("--- Inventory Listing ---");

        for (int i = 0; i < count; i++) {

            Item item = items[i];

            System.out.printf(
                "%-15s | %-8s | Stock: %d%n",
                item.getName(),
                item.getGenre(),
                item.getStockCount()
            );
        }
    }

    // Audit serial codes
    public void auditSerialCodes() {

        System.out.println("--- Serial Code Audit ---");

        for (int i = 0; i < count; i++) {

            Item item = items[i];

            System.out.printf(
                "%-15s -> %s%n",
                item.getName(),
                item.getSerialCode()
            );
        }
    }
}