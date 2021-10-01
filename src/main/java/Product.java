import java.util.ArrayList;

public abstract class Product {
    private String name;
    private Double price;
    protected ExpirationDate expirationDate;
    public double DISCOUNT_RATE = .10;

    public Product(String name,Double price){
        this.name = name;
        this.price = price;
    }

    public void printExpirationDate(){
        System.out.println(this.expirationDate.toString());
    }
    public double calculateDiscount(){
        return  this.price * this.DISCOUNT_RATE;
    }

    public static void printOrder(Product[] products){
        for (Product product:
             products) {
            System.out.println(String.format("Product: %s, Price: %.2f",product.name , product.price));
        }
    }
    public static void printConsumptionQty(ArrayList<Consumable> consumables){
        for (Consumable consumable:
                consumables) {
            System.out.println(String.format("Consumable name: %s, Price: %d",consumable.getClass().toString(), consumable.consume()));
        }
    }
    public static void printIngredients(String[] ingredients){
        for(String ingredient: ingredients ){
            System.out.println(ingredient);
        }
    }


}
