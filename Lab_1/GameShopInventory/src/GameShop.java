import game.inventory.Item;
import game.inventory.Inventory;

public class GameShop {

    public static void main(String[] args) {

        Inventory shop = new Inventory();

        // Create items
        Item item1 = new Item(
            "Galaxy Racer", "Racing", 12, "GR-4421"
        );

        Item item2 = new Item(
            "Shadow Realm", "RPG", 5, "SR-8873"
        );

        Item item3 = new Item(
            "Pixel Legends", "Strategy", 3, "PL-0091"
        );

        // Add items to inventory
        shop.addItem(item1);
        shop.addItem(item2);
        shop.addItem(item3);

        // Display original inventory
        shop.displayAll();

        System.out.println();

        // Sell items
        item1.sell(4);
        item2.sell(6);

        System.out.println();

        // Display updated inventory
        shop.displayAll();

        System.out.println();

        // Audit serial codes
        shop.auditSerialCodes();

        // The following call would fail to compile:
        // System.out.println(item1.getSerialCode());
        //
        // Reason:
        // getSerialCode() is package-private.
        // GameShop is outside the game.inventory package.
    }
}