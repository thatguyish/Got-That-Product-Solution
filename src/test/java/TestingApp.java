import org.junit.Assert;
import org.junit.Test;


public class TestingApp {
    @Test
    public void calculateDiscountTest(){
        CheeseBurger burger = new CheeseBurger("mcDonalds-Burger",3.99);

        Double expectedDiscount = 3.99 *.2;

        Double actualDiscount = burger.calculateDiscount();

        Assert.assertEquals(expectedDiscount,actualDiscount);
    }
}
