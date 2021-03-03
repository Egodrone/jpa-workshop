package se.lexicon.jpaworkshop.entity;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class OrderItemTest {

    private Product product = new Product();
    private OrderItem orderItem = new OrderItem();


    @Test
    public void test_order_price() {
        Product p1 = new Product(1, "Beef", 200);
        OrderItem o1 = new OrderItem(1, 9, p1, new ProductOrder());
        Assertions.assertEquals(1800, orderItem.totalOrderPrice(p1, 9));
    }

}
