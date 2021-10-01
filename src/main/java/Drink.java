public abstract class Drink extends Product implements Consumable {

    public Drink(String name, Double price) {
        super(name, price);
        this.DISCOUNT_RATE+=.20;
    }
}
