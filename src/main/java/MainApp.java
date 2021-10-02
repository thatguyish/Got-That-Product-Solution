import java.util.ArrayList;

public class MainApp {



    public static void main(String[] args) {
        CocaCola coke = new CocaCola("CherryCoke",2.5);
        CheeseBurger burger = new CheeseBurger("burger-w-ketchup",3.5);
        Batteries batteries = new Batteries("Energizer",3d);
        Car car = new Car("Chevy",200d);

        ArrayList<Product> products = new ArrayList<Product>();
        products.add(coke);
        products.add(burger);
        products.add(batteries);
        products.add(car);

        ExpirationDate expirationDate1 = new ExpirationDate("05","17","1995");
        ExpirationDate expirationDate2 = new ExpirationDate("06","16","1994");
        ExpirationDate expirationDate3 = new ExpirationDate("03","13","2023");
        ExpirationDate expirationDate4 = new ExpirationDate("05","13","2076");

        coke.expirationDate = expirationDate1;
        burger.expirationDate = expirationDate2;
        batteries.expirationDate = expirationDate3;
        car.expirationDate = expirationDate4;

        Product[] productsArray = {coke,batteries,car,burger};
        batteries.printExpirationDate();
        Product.printOrder(productsArray);

        ArrayList<Consumable> consumables = new ArrayList<Consumable>();
        Product.printConsumptionQty(consumables);

        System.out.println(String.format("%.2f",car.calculateDiscount()));
        System.out.println(String.format("%.2f",burger.calculateDiscount()));
        System.out.println(String.format("%.2f",coke.calculateDiscount()));

        System.out.println(burger.isEdible());

        Drink drink = new CocaCola("orange-coke",4.99);
        int drinkConsume = ((CocaCola) drink).consume();
        System.out.println(drinkConsume);
        String[] ingredients = {"water", "sugar"};

        Product.printIngredients(ingredients);





    }
}
