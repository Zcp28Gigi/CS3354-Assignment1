public class GroceryManagementSystem {
  public static void main(String[] args) {
    String[] itemNames = new String[10];
    double[] itemPrices = new double[10];
    int[] itemStocks = new int[10];
  }

  /**
   * Restocks an item by searching for its name in the names array and adding
   * the given amount to the corresponding index in the stocks array.
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

}