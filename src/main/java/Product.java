import java.util.ArrayList;

public abstract class Product {
    public String getName() {
        return name;
    }

    private String name;

    public Double getPrice() {
        return price;
    }

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
        double orderTotal = 0d;
        for (Product product:
             products) {
            System.out.println(String.format("Product: %s, Price: %.2f",product.name , product.price));
            orderTotal+=product.getPrice();
        }
        System.out.println(String.format("You're total is %.2f",orderTotal));
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
