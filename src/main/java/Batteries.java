public class Batteries extends Product implements Consumable{

    public Batteries(String name, Double price) {
        super(name, price);
    }

    @Override
    public int consume() {
        return (int)Math.random() * 999;
    }
}
