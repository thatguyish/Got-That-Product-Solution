public class CocaCola extends Drink{

    public CocaCola(String name, Double price) {
        super(name, price);
    }

    @Override
    public int consume() {
        return 0;
    }
}
