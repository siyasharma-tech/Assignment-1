class FoodItem {
    int itemId;
    String itemName;
    double price;
    static String cafeteriaName = "UCampus Cafeteria";
    static double serviceCharge = 10.0;
    static int totalFoodItems = 0;
    void addFoodItem(int itemid, String itemname, double price) {
        this.itemId = itemid;
        this.itemName = itemname;
        this.price = price;
        totalFoodItems++;
    }
    double calculateFinalPrice() {
        return price + (price * serviceCharge / 100);
    }
    void displayItemDetails() {
        System.out.println("Item ID : " + itemId);
        System.out.println("Item Name : " + itemName);
        System.out.println("Original Price : " + price);
        System.out.println("Final Price : " + calculateFinalPrice());
        System.out.println();
    }
    static void changeServiceCharge(double newCharge) {
        serviceCharge = newCharge;
    }
    static void displayCafeteriaDetails() {
        System.out.println("Cafeteria Name : " + cafeteriaName);
        System.out.println("Service Charge : " + serviceCharge + "%");
        System.out.println("Total Food Items : " + totalFoodItems);
        System.out.println();
    }
    public static void main(String[] args) {
        FoodItem item1 = new FoodItem();
        FoodItem item2 = new FoodItem();
        FoodItem item3 = new FoodItem();
        item1.addFoodItem(1, "Veg Sandwich", 50);
        item2.addFoodItem(2, "Cold Coffee", 200);
        item3.addFoodItem(3, "Paneer Wrap", 180);
        FoodItem.displayCafeteriaDetails();
        item1.displayItemDetails();
        item2.displayItemDetails();
        item3.displayItemDetails();
        FoodItem.changeServiceCharge(15);
        System.out.println("-------------------------------------");
        System.out.println("After Updating Service Charge");
        System.out.println("-------------------------------------");
        System.out.println();
        item1.displayItemDetails();
        item2.displayItemDetails();
        item3.displayItemDetails();
    }
}