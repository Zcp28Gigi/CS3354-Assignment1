import java.util.Scanner;

public class GroceryManagementSystem {
  public static void main(String[] args) {
    String[] itemNames = new String[10];
    double[] itemPrices = new double[10];
    int[] itemStocks = new int[10];

    Scanner keyboard = new Scanner(System.in);
    int option;
    do {
      System.out.print("=== GROCERY MANAGEMENT SYSTEM ===\n1. View\n2. Restock\n3. Exit\n");
      System.out.print("Enter the desired option[1-3]: ");
      option = keyboard.nextInt();
      keyboard.nextLine();
      if (option < 1 || option > 3)
        System.out.println("Error. Invalid input. Provide a valid option between 1 and 3 inclusive.");
      else
        switch (option) {
          case 1:
            printInventory(itemNames, itemPrices, itemStocks);
            break;
          case 2:
            System.out.print("Item name:");
            String itemName = keyboard.nextLine();

            System.out.print("Amount to add to stock:");
            int addAmount = keyboard.nextInt();
            keyboard.nextLine();

            restockItem(itemNames, itemStocks, itemName, addAmount);
            break;
          case 3:
            System.out.println("Exiting...");
            break;
        }
    } while (option != 3);
    keyboard.close();
  }

  /**
   * Restocks an item by searching for its name in the names array and adding the
   * given amount to
   * the corresponding index in the stocks array.
   *
   * @param names  array of item names (parallel to stocks)
   * @param stocks array of item stock counts (parallel to names)
   * @param target the item name to search for
   * @param amount amount to add to the stock if found
   */
  public static void restockItem(String[] names, int[] stocks, String target, int amount) {
    for (int i = 0; i < names.length; i++) {
      if (names[i] != null && names[i].equalsIgnoreCase(target)) {
        stocks[i] += amount;
        System.out.println("Restocked " + names[i] + ". New stock: " + stocks[i]);
        return;
      }
    }
    System.out.println("Item not found.");
  }

  /**
   * Prints the inventory of the grocery store. Excludes slots that are empty
   * (null names).
   * 
   * @param names  Array of item names.
   * @param prices Array of item prices.
   * @param stocks Array of item stock quantities.
   */
  public static void printInventory(String[] names, double[] prices, int[] stocks) {
    System.out.println("Inventory:");
    for (int i = 0; i < names.length; i++) {
      if (names[i] != null) {
        System.out.println(names[i] + " - Price: $" + prices[i] + ", Stock: " + stocks[i]);
      }
    }
  }
}
