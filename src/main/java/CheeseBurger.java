public class CheeseBurger extends Food{

    public CheeseBurger(String name, Double price) {
        super(name, price);
    }

    @Override
    public boolean isEdible() {
        return true;
    }
}
