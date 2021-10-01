public abstract class Food extends Product implements Edible {

    public Food(String name, Double price) {
        super(name, price);
        this.DISCOUNT_RATE+=.10;
    }
}
