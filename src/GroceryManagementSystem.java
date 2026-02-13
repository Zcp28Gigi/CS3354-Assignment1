public Class GroceryManagementSystem {
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];
    }

    /**
     * Prints the inventory of the grocery store. Excludes slots that are empty (null names).
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