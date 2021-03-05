package se.lexicon.jpaworkshop.entity;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class OrderItemTest {

    private Product product;
    private OrderItem testObject;


    @BeforeEach
    public void setup() {
        product = new Product(1, "Beef", 200);
        testObject = new OrderItem();
    }


    @Test
    @DisplayName("Test of setters and getters")
    public void test_setters_and_getters() {
        testObject = new OrderItem(1, 9, product, new ProductOrder());
        Assertions.assertEquals(1, testObject.getId());
        Assertions.assertEquals(9, testObject.getQuantity());
        Assertions.assertEquals("Beef", testObject.getProduct().getName());
    }


    @Test
    @DisplayName("Test of total order price")
    public void test_order_price() {
        testObject = new OrderItem(1, 9, product, new ProductOrder());
        Assertions.assertEquals(1800, testObject.totalOrderPrice(product, 9));
    }

}
